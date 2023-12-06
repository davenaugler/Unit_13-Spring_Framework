package com.coderscampus;

import com.coderscampus.unit13.domain.User;
import com.coderscampus.unit13.service.FileService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Unit13Configuration {
    // `Configuration` appended to the end of a class name or file name
    // it typically means it's used as part of the configuration of the web application

    @Bean
    public FileService fileService() {
        return new FileService("test.txt");
    }

    @Bean
    public User user() {
        return new User("alexsmith", "password", "Alex Smith");
    }

}
