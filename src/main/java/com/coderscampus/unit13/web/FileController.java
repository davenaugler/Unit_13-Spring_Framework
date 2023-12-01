package com.coderscampus.unit13.web;

import com.coderscampus.unit13.service.FileService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;
import java.util.Random;

@RestController
public class FileController {
    private final FileService fileService;

    public FileController(FileService fileService) {
        this.fileService = fileService;
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


        return fileService.readFile("test.txt");
    }

    @GetMapping("/read-text-2")
    public List<String> readText2() throws IOException {
        return fileService.readFile("test2.txt");
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

