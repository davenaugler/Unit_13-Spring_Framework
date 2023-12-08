package com.coderscampus.unit13.config;

import com.coderscampus.unit13.domain.User;
import com.coderscampus.unit13.service.FileService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("qa")
public class Unit13QAConfiguration {
    // `Configuration` appended to the end of a class name or file name
    // it typically means it's used as part of the configuration of the web application

    @Value("${superuser.username}")
    private String username;
    @Value("${superuser.password}")
    private String password;
    @Value("${superuser.name}")
    private String name;


    @Bean
    public FileService fileService() {
        return new FileService("test.txt");
    }

    @Bean
    public User user() {
        return new User(username, password, name);
    }

}
