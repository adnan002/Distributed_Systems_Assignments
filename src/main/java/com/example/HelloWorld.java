package com.example;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class HelloWorld {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Usage: java HelloWorld <filename> <text>");
            System.exit(1);
        }

        String filename = args[0];
        String textToWrite = args[1];

        try {
            Files.deleteIfExists(Paths.get(filename)); // Clear previous contents
            FileWriter writer = new FileWriter(filename);
            writer.write(textToWrite + "\n"); // Add newline for better formatting.
            writer.close();
            System.out.println("Wrote to file: " + filename);
        } catch (IOException e) {
            System.err.println("Error opening or writing to file: " + filename);
            e.printStackTrace();
            System.exit(1);
        }
    }
}
