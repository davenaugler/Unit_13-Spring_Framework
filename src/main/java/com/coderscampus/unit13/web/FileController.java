package com.coderscampus.unit13.web;

import com.coderscampus.unit13.service.FileService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class FileController  {
    private FileService fileService;

   // Constructor for dependency injection
    public void FileController(FileService fileService) {
        this.fileService = fileService;
    }

    // GetMapping() listens for GET requests related to the URL path
    // GetMapping() is what we use to listen for a request on a certain path
    //   and direct it to a certain method
    @GetMapping("/read-lines")
    public List<String> readLines() throws IOException {
       // Directly use the fileService, no need to get it from the ApplicationContext
        System.out.println(fileService); // For me to see
        return fileService.readFile("test.txt");
    }

    @GetMapping("/read-text-2")
    public List<String> readText2() throws IOException {
        return fileService.readFile("test2.txt");
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
