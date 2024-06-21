package com.peter.Discussionroom.user;

import com.peter.Discussionroom.user.Users.User;
import com.peter.Discussionroom.user.Users.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


    @SpringBootApplication
    public class DiscussionRoomApplication {

        public static void main(String[] args) {
            SpringApplication.run(DiscussionRoomApplication.class, args);
        }

        @Bean
        public org.springframework.boot.CommandLineRunner commandLineRunner(
                UserService service
        ) {
            return args -> {
                service.register(User.builder()
                        .username("Peter")
                        .email("godwinapeter@gmail.com")
                        .password("123456")
                        .build());

                service.register(User.builder()
                        .username("Sunny")
                        .email("sunny@mail.com")
                        .password("123456")
                        .build());

                service.register(User.builder()
                        .username("Sunny@gmail.com")
                        .email("sunny@gmail.com")
                        .password("123456")
                        .build());
            };
        }


    }

