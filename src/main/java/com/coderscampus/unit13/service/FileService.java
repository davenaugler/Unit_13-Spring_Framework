package com.coderscampus.unit13.service;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@Service
public class FileService {

    public List<String> readFile(String filename) throws IOException {
        return Files.readAllLines(Paths.get(filename));
    }
}
