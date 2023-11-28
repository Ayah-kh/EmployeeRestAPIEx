package com.example.EmployeeAPI;

import com.example.EmployeeAPI.entity.*;
import com.example.EmployeeAPI.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class EmployeeApiApplication {

    @Autowired
    Post1Repository post1Repository;
    @Autowired
    CommentRepository commentRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserProfileRepository userProfileRepository;
    @Autowired
    private TagRepository tagRepository;
    @Autowired
    private PostRepository postRepository;

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(EmployeeApiApplication.class, args);
        MyStreamRepository myStreamRepository = run.getBean(MyStreamRepository.class);
        ViewerRepository viewerRepository = run.getBean(ViewerRepository.class);

        Viewer viewer1=new Viewer("J122");
        Viewer viewer2=new Viewer("A456");
        Viewer viewer3=new Viewer("kl456");
        List<Viewer> viewers=Arrays.asList(viewer1,viewer2,viewer3);

        MyStream cookingStream=new MyStream("Cooking is Auesome");
        MyStream gamingStream = new MyStream("Gaming");
        List<MyStream> myStreams=Arrays.asList(cookingStream,gamingStream);

        myStreamRepository.saveAll(myStreams);


        viewer1.followStream(cookingStream);
        viewer1.followStream(gamingStream);
        viewer2.followStream(gamingStream);
        viewer3.followStream(gamingStream);

        viewerRepository.saveAll(viewers);


    }

//    @Override
//    public void run(String... args) throws Exception {
//        User user = new User();
//        user.setName("Ayah");
//        user.setEmail("Ayah@gmail.com");
//
//        UserProfile userProfile = new UserProfile();
//        userProfile.setAddress("Amman");
//        userProfile.setBirthOfDate(LocalDate.of(1991, 03, 24));
//        userProfile.setGender(Gender.FEMALE);
//        userProfile.setPhoneNumber("000000000");
//
//        user.setUserProfile(userProfile);
//        userProfile.setUser(user);
//
////        userRepository.save(user);
//        userProfileRepository.save(userProfile);
//
//        Post post1 = new Post("Hibernate",
//                "Hibernate Many to Many",
//                "Hibernate Many to Many");
//        Post post2 = new Post("Spring boot",
//                "Spring boot Many to Many",
//                "Spring boot Many to Many");
//
//        Tag springBoot = new Tag("Spring Boot");
//        Tag hibernate = new Tag("Hibernate");
//
//        post1.getTags().add(springBoot);
//        post1.getTags().add(hibernate);
//
//        post2.getTags().add(springBoot);
//        post2.getTags().add(hibernate);
//
//        springBoot.getPosts().add(post1);
//        springBoot.getPosts().add(post2);
//        hibernate.getPosts().add(post1);
//        hibernate.getPosts().add(post2);
//
//        this.postRepository.save(post1);
//        this.postRepository.save(post2);
//
//        Post1 post = new Post1("One to Many Mapping", "Using Hibernate");
//        Post1 post3 = new Post1("Connection to database", "Spring boot basics");
//        Comment comment1 = new Comment("very useful");
//        Comment comment2 = new Comment("very informative");
//        Comment comment3 = new Comment("Great post");
//        Comment comment4 = new Comment("You are the best");
//        Comment comment5 = new Comment("I hate you");
//        Comment comment6 = new Comment("Thinking");
//
//        post.getComments().add(comment1);
//        post.getComments().add(comment2);
//        post.getComments().add(comment3);
//
//        post3.getComments().add(comment4);
//
//
//        post3.getComments().add(comment5);
//
//
//        this.post1Repository.save(post);
//        this.post1Repository.save(post3);
//
//    }
}
