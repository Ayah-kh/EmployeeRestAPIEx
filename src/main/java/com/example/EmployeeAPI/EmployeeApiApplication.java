package com.example.EmployeeAPI;

import com.example.EmployeeAPI.entity.Gender;
import com.example.EmployeeAPI.entity.User;
import com.example.EmployeeAPI.entity.UserProfile;
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

	@Override
	public void run(String... args) throws Exception {
		User user=new User();
		user.setName("Ayah");
		user.setEmail("Ayah@gmail.com");

		UserProfile userProfile = new UserProfile();
		userProfile.setAddress("Amman");
		userProfile.setBirthOfDate(LocalDate.of(1991,03,24));
		userProfile.setGender(Gender.FEMALE);
		userProfile.setPhoneNumber("000000000");

		user.setUserProfile(userProfile);
		userProfile.setUser(user);

		userRepository.save(user);



	}
}
