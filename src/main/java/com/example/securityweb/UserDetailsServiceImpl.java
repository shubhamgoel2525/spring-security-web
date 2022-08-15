package com.example.securityweb;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class UserDetailsServiceImpl {

	@Bean
	public UserDetailsService users() {
		UserBuilder users = User.withDefaultPasswordEncoder();
		UserDetails user = users.username("shubham").password("test@1234").authorities(new ArrayList<>()).build();

		return new InMemoryUserDetailsManager(user);
	}

}
