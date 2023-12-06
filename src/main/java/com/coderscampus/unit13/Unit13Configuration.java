package com.coderscampus.unit13;

import com.coderscampus.unit13.domain.User;
import com.coderscampus.unit13.service.FileService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.io.File;

@Configuration
public class Unit13Configuration {
    // `Configuration` appended to the end of a class name or file name
    // it typically means it's used as part of the configuration of the web application


    // For illustration purposes only as an example of a real
    //  world type scenario of connecting to a database
//  @Bean
//	public Datasource datasource () {
//		Datasource db = new Datasource();
//		db.setConnectionString("http://aslkdfj.sdkfjhsd.com:3360");
//		db.setUsername("dev01dbblahblah")
//
//		return db;
//	}

    @Bean
    public FileService fileService() {
        return new FileService("test.txt");
    }


    @Bean
    public User user() {
        return new User("alexsmith", "password", "Alex Smith");
    }

}
