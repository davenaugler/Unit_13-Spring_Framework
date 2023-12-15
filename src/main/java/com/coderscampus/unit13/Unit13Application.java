package com.coderscampus.unit13;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

@SpringBootApplication
// @ComponentScan("com.coderscampus") - left in as a reminder that it exists
public class Unit13Application {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(Unit13Application.class, args);

//        Reader in = new FileReader("recipes.csv");
//        Iterable<CSVRecord> records = CSVFormat.RFC4180.withHeader("Cooking Minutes", "Dairy Free", "Gluten Free", "Instructions", "Preparation Minutes", "Price Per Serving", "Ready In Minutes", "Servings", "Spoonacular Score", "Title", "Vegan", "Vegetarian").parse(in);
//        for (CSVRecord record : records) {
//            String cookingMinutes = record.get("Cooking Minutes");
//            System.out.println(cookingMinutes);

        // This prints out the Cooking Instructions for the first dish.
        Reader in = new FileReader("recipes.csv");
        Iterable<CSVRecord> records = CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreSurroundingSpaces().parse(in);
        int count = 0;
        for (CSVRecord record : records) {
            count++;
            if (count == 2) {
                String instructions = record.get("Instructions");
                System.out.println(instructions);
                break;
            }
            // Define the CSV file paths


//			record.get(0);
//			record.get(1);
//			record.get(2);
//			record.get(50);

//			String lastName = record.get("Last Name");
//			String firstName = record.get("First Name");
        }

    }
}


