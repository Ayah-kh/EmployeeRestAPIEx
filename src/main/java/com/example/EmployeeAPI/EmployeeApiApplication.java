package com.example.EmployeeAPI;

import com.example.EmployeeAPI.entity.Comment;
import com.example.EmployeeAPI.entity.Post1;
import com.example.EmployeeAPI.repository.CommentRepository;
import com.example.EmployeeAPI.repository.Post1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeApiApplication implements CommandLineRunner {

    @Autowired
    Post1Repository post1Repository;

//	@Autowired
//	private UserRepository userRepository;
//
//	@Autowired
//	private UserProfileRepository userProfileRepository;
//
//	@Autowired
//	private TagRepository tagRepository;
//
//	@Autowired
//	private PostRepository postRepository;
    @Autowired
    CommentRepository commentRepository;

    public static void main(String[] args) {
        SpringApplication.run(EmployeeApiApplication.class, args);
    }

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

//		Post post1=new Post("Hibernate",
//				"Hibernate Many to Many",
//				"Hibernate Many to Many");
//		Post post2=new Post("Spring boot",
//				"Spring boot Many to Many",
//				"Spring boot Many to Many");
//
//		Tag springBoot = new Tag("Spring Boot");
//		Tag hibernate = new Tag("Hibernate");
//
//		post1.getTags().add(springBoot);
//		post1.getTags().add(hibernate);
//
//		post2.getTags().add(springBoot);
//		post2.getTags().add(hibernate);
//
//		springBoot.getPosts().add(post1);
//		springBoot.getPosts().add(post2);
//		hibernate.getPosts().add(post1);
//		hibernate.getPosts().add(post2);
//
//		this.postRepository.save(post1);
//		this.postRepository.save(post2);

        Post1 post = new Post1("One to Many Mapping", "Using Hibernate");
        Post1 post2 = new Post1("Connection to database", "Spring boot basics");
        Comment comment1 = new Comment("very useful");
        Comment comment2 = new Comment("very informative");
        Comment comment3 = new Comment("Great post");
        Comment comment4 = new Comment("You are the best");
        Comment comment5 = new Comment("I hate you");
        Comment comment6 = new Comment("Thinking");

        post.getComments().add(comment1);
        post.getComments().add(comment2);
        post.getComments().add(comment3);

        post2.getComments().add(comment4);


        post2.getComments().add(comment5);



        this.post1Repository.save(post);
        this.post1Repository.save(post2);

        Post1 postExisted = post1Repository.findById(1L).orElseThrow(RuntimeException::new);
        postExisted.getComments().add(comment6);

        this.post1Repository.save(postExisted);
    }
}
