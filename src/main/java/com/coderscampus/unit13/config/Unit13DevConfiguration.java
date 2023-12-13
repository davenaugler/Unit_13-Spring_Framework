package com.coderscampus.unit13.config;

import com.coderscampus.unit13.domain.User;
import com.coderscampus.unit13.service.FileService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class Unit13DevConfiguration {
    // `Configuration` appended to the end of a class name or file name
    // it typically means it's used as part of the configuration of the web application

    @Bean
    public FileService fileService() {
        return new FileService("test.txt");
    }

//     The below context is for illustration purposes only. Users wouldn't be stored as Beans,
//     they would be stored in a database.

    @Bean
    public User superUser() {
        return new User("superDave@gmail.com", "superUser", "Dave");
    }

    @Bean
    public User regularUser() {
        return new User("regularJoe@gmail.com", "regularUser", "Dave");
    }

}
