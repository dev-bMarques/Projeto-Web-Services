package com.b.dev.webServices.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.b.dev.webServices.entities.User;
import com.b.dev.webServices.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User (null, "Bruno", "bruno@gmail.com","31999999999","123456");
		User u2 = new User (null, "Urnob", "urnob@gmail.com","31888888888","654321");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		
	}
	
	

}
