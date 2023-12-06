package com.coderscampus.unit13.web;

import com.coderscampus.unit13.domain.User;
import com.coderscampus.unit13.service.FileService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;
import java.util.Random;

@RestController
public class FileController {

    @Value("${superuser.username}")
    private String superuserUserName;

    @Value("${superuser.password}")
    private String superuserPassword;

    @Value("${superuser.name}")
    private String superuserName;
    private final FileService fileService;
    private final User user;


    public FileController(FileService fileService, User user) {
        this.fileService = fileService;
        this.user = user;
    }

    @GetMapping("/customer-report")
    public Integer getCustomerData(Integer customerId) {
        Integer customerData = 0;
        // fetch data based on customerId
        customerData = getCustomerDataById(customerId);
        return customerData;
    }

    private Integer getCustomerDataById(Integer customerId) {
        return new Random().nextInt();
    }

    @GetMapping("/read-lines")
    public List<String> readLines() throws IOException {
        System.out.println("User: " + user);

        System.out.println("UserName: " + superuserUserName);
        System.out.println("Password: " + superuserPassword);
        System.out.println("Name: " + superuserName);

//        return fileService.readFile("test.txt");
        return fileService.readFile();
    }

    @GetMapping("/read-text-2")
    public List<String> readText2() throws IOException {
//        return fileService.readFile("test2.txt");
        return fileService.readFile();
    }

    @GetMapping("/hello-universe")
    public String helloUniverse() {
        return "Hello Universe!";
    }

    @PostMapping("/hello-world")
    public String helloWorldPost() {
        return "You just POSTED some data!";
    }

}

