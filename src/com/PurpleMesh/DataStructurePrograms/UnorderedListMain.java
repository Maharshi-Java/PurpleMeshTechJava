package com.PurpleMesh.DataStructurePrograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.PurpleMesh.Utility.Utility;

public class UnorderedListMain {

    public static void main(String[] args) {

       

        String fileName = "unorderedlist.txt";
        
        while(true) {
        System.out.println("Enter the word to search:");
        String searchWord = Utility.getNextLine();

        
        UnorderedLists<String> list = new UnorderedLists<>();

       
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine();
            if (line != null && !line.trim().isEmpty()) {
                String[] wordArray = line.split(",");
                for (String word : wordArray) {
                    list.add(word.trim());
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

       
        if (list.search(searchWord)) {
            list.remove(searchWord);
            System.out.println("Word found and removed: " + searchWord);
        } else {
            list.add(searchWord);
            System.out.println("Word added: " + searchWord);
        }

        try (FileWriter writer = new FileWriter(fileName)) {
            String liString = list.toString();
            String fileContent = liString.replace(" ", ",");
            writer.write(fileContent);
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

       
        System.out.println("Updated list:");
        System.out.println(list.toString());
    }
}
}
