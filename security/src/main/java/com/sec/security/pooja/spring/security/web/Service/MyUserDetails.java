package com.sec.security.pooja.spring.security.web.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.sec.security.pooja.spring.security.web.entity.Authority;
import com.sec.security.pooja.spring.security.web.entity.Role;
import com.sec.security.pooja.spring.security.web.entity.User;
import com.sec.security.pooja.spring.security.web.repository.UserRepository;

public class MyUserDetails implements UserDetailsService {
	private final UserRepository userRepository;

	public MyUserDetails(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> optUser = userRepository.findByUserName(username);
		optUser.orElseThrow(() -> new UsernameNotFoundException("no such user exist"));
		return optUser.map(user -> new org.springframework.security.core.userdetails.User(user.getUserName(),
				user.getPassword(), /* getAuthorities(user) */getAuthorities(user.getRoles()))).get();

	}
	/*
	 * private Collection<? extends GrantedAuthority> getAuthorities(User user) {
	 * 
	 * return user.getRoles().stream().map(role -> new
	 * SimpleGrantedAuthority("ROLE_" + role.getRole()))
	 * .collect(Collectors.toList()); }
	 */

	private Collection<? extends GrantedAuthority> getAuthorities(Collection<Role> roles) {
		return getGrantedAuthorities(getPrivileges(roles));
	}

	private List<String> getPrivileges(Collection<Role> roles) {
		List<String> privileges = new ArrayList<>();
		List<Authority> collection = new ArrayList<>();
		for (Role role : roles) {
			collection.addAll(role.getAuthority());
		}
		for (Authority item : collection) {
			privileges.add(item.getPrivilage());
		}
		return privileges;
	}

	private List<GrantedAuthority> getGrantedAuthorities(List<String> privileges) {
		List<GrantedAuthority> authorities = new ArrayList<>();
		for (String privilege : privileges) {
			authorities.add(new SimpleGrantedAuthority(privilege));
		}
		//authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
		return authorities;
	}

}
