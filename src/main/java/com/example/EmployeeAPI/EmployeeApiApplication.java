package com.example.EmployeeAPI;

import com.example.EmployeeAPI.entity.*;
import com.example.EmployeeAPI.repository.PostRepository;
import com.example.EmployeeAPI.repository.TagRepository;
import com.example.EmployeeAPI.repository.UserProfileRepository;
import com.example.EmployeeAPI.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class EmployeeApiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApiApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserProfileRepository userProfileRepository;

	@Autowired
	private TagRepository tagRepository;

	@Autowired
	private PostRepository postRepository;

	@Override
	public void run(String... args) throws Exception {
//		User user=new User();
//		user.setName("Ayah");
//		user.setEmail("Ayah@gmail.com");
//
//		UserProfile userProfile = new UserProfile();
//		userProfile.setAddress("Amman");
//		userProfile.setBirthOfDate(LocalDate.of(1991,03,24));
//		userProfile.setGender(Gender.FEMALE);
//		userProfile.setPhoneNumber("000000000");
//
//		user.setUserProfile(userProfile);
//		userProfile.setUser(user);
//
//		userRepository.save(user);

		Post post1=new Post("Hibernate",
				"Hibernate Many to Many",
				"Hibernate Many to Many");
		Post post2=new Post("Spring boot",
				"Spring boot Many to Many",
				"Spring boot Many to Many");

		Tag springBoot = new Tag("Spring Boot");
		Tag hibernate = new Tag("Hibernate");

		post1.getTags().add(springBoot);
		post1.getTags().add(hibernate);

		post2.getTags().add(springBoot);
		post2.getTags().add(hibernate);

		springBoot.getPosts().add(post1);
		springBoot.getPosts().add(post2);
		hibernate.getPosts().add(post1);
		hibernate.getPosts().add(post2);

		this.postRepository.save(post1);
		this.postRepository.save(post2);

	}
}
