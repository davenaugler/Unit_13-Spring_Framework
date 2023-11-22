package com.coderscampus.unit13.web;

import com.coderscampus.unit13.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class FileController  {

    @Autowired
    private FileService fileService;

    @GetMapping()
    public List<String> readLines() throws IOException {
        return fileService.readFile("test.txt");
    }

}
