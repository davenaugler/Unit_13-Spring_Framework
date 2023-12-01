package com.coderscampus.unit13;

import com.coderscampus.unit13.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Unit13Configuration {
    // Configuration appended to the end of a class name or file name
    // it typically means it's used as part of the configuration of the web application
    @Bean
    public User user() {
        return new User("davenaugler", "password", "Dave Naugler");
    }

}
