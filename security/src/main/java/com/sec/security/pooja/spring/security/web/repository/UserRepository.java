package com.sec.security.pooja.spring.security.web.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sec.security.pooja.spring.security.web.entity.User;

public interface UserRepository extends JpaRepository<User,Integer>{
	
	Optional<User> findByUserName(String userName);

}
