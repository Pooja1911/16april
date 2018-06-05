package com.sec.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sec.security.pooja.spring.security.web.entity.Authority;
import com.sec.security.pooja.spring.security.web.entity.Role;
import com.sec.security.pooja.spring.security.web.entity.User;
import com.sec.security.pooja.spring.security.web.repository.UserRepository;

@SpringBootApplication
public class SecurityApplication implements CommandLineRunner {
	@Autowired
	UserRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		repository.deleteAll();
		Authority authority = new Authority("READ");
		Authority authoriti = new Authority("WRITE");
		List<Authority> authorities = new ArrayList<>();
		authorities.add(authority);
		authorities.add(authoriti);
		Role role = new Role("ADMIN", authorities);
		List<Role> roles = new ArrayList<>();
		roles.add(role);
		// roles.add(new Role("USER"));
		User user = new User("Pooja", "jain", roles);
		repository.saveAndFlush(user);

		//Authority authority1 = new Authority("READ");
		List<Authority> authorities1 = new ArrayList<>();
		authorities1.add(authority);
		List<Role> sonRole = new ArrayList<>();
		sonRole.add(new Role("USER", authorities1));
		User user2 = new User("Sonam", "Pandey", sonRole);
		//repository.saveAndFlush(user2);

	}
}
