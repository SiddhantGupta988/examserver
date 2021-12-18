package com.exam;



import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exam.models.Role;
import com.exam.models.User;
import com.exam.models.UserRole;
import com.exam.service.UserService;

@SpringBootApplication
public class ExamserverApplication implements CommandLineRunner{


	@Autowired
	private UserService userservice;

	public static void main(String[] args) {
		SpringApplication.run(ExamserverApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User user = new User();
		user.setFirstName("raj");
		user.setLastName("gupta");
		user.setUsername("raj303");
		user.setEmail("raj@gmail.com");
		user.setPassword("12323");
		user.setPhone("855465777");
		user.setProfile("profile.png");
		
		Role r1 = new Role();
		r1.setRole_id(23L);
		r1.setRole("Admin");
		
		UserRole user_role = new UserRole();
		user_role.setRole(r1);
		user_role.setUser(user);
		
		Set<UserRole> user_role_set = new HashSet<>();
		user_role_set.add(user_role);
		
		User user1 = this.userservice.createUser(user,user_role_set);
		System.out.println(user1.getUsername());
	}

}
 