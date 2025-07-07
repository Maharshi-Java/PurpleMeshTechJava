package com.PurpleMesh.DataStructurePrograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.PurpleMesh.Utility.Utility;

public class OrderedListMain {

    public static void main(String[] args) {

         

        String fileName = "orderedlist.txt";
        while(true) {
        	System.out.println("Enter the number to search:");
            int searchNumber = Utility.getNextInt(); 
        
        OrderedList<Integer> list = new OrderedList<>();

        
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine();
            if (line != null && !line.trim().isEmpty()) {
                String[] numberArray = line.split(",");
                for (String numStr : numberArray) {
                    list.add(Integer.parseInt(numStr.trim()));
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        if (list.search(searchNumber)) {
            list.remove(searchNumber);
            System.out.println("Number found and removed: " + searchNumber);
        } else {
            list.add(searchNumber);
            System.out.println("Number added in sorted order: " + searchNumber);
        }

      
        try (FileWriter writer = new FileWriter(fileName)) {
            String listString = list.toString();
            String fileContent = listString.replace(" ", ",");
            writer.write(fileContent);
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        System.out.println("Updated Ordered List:");
        System.out.println(list.toString());
    }
}
}