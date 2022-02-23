package com.company;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        String fileName = "C:\\Users\\Мазури\\IdeaProjects\\7.4\\inputText.txt";
        String content = Files.lines(Paths.get(fileName)).reduce("", String::concat);
        String updatedText = Go.uptext(content);
        FileWriter writer = new FileWriter("C:\\Users\\Мазури\\IdeaProjects\\7.4\\outputText.txt");
        writer.write(updatedText);
        writer.flush();
    }
}




