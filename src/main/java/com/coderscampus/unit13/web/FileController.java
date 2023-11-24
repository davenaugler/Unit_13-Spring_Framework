package com.coderscampus.unit13.web;

import com.coderscampus.unit13.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class FileController  {

    @Autowired
    private FileService fileService;

    // GetMapping() listens for GET requests related to the URL path
    // GetMapping() is what we use to listen for a request on a certain path
    //   and direct it to a certain method
    @GetMapping("/read-lines")
    public List<String> readLines() throws IOException {
        return fileService.readFile("test.txt");
    }

    @GetMapping("/hello-world")
    public String helloWorld() {
       return "Hello Universe!";
    }

    @PostMapping("/hello-world")
    public String helloWorldPost() {
        return "You just POSTED some data!";
    }

}
