package com.PurpleMesh.DataStructurePrograms;

import java.io.*;
import java.util.*;

import com.PurpleMesh.Utility.Utility;

public class SearchNumberInSlot {

    static Map<Integer, OrderedList<Integer>> slotMap = new HashMap<>();

    public static void main(String[] args) throws IOException {
        String fileName = "slots.txt";

        
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] numbers = line.split(",");
                for (String numStr : numbers) {
                    if (!numStr.trim().isEmpty()) {
                        int number = Integer.parseInt(numStr.trim());
                        addToSlot(number);
                    }
                }
            }
        }

        
        System.out.println("Enter a Number to Search:");
       
        int num =Utility.getNextInt();

        int slot = num % 11;
        slotMap.putIfAbsent(slot, new OrderedList<>());
        OrderedList<Integer> chainList = slotMap.get(slot);

        if (chainList.search(num)) {
            chainList.remove(num);
            System.out.println("Number Found and Removed");
        } else {
            chainList.add(num);
            System.out.println("Number Not Found and Added");
        }

        printSlots();
        saveToFile(fileName);
    }

    static void addToSlot(int n) {
        int slot = n % 11;
        slotMap.putIfAbsent(slot, new OrderedList<>());
        slotMap.get(slot).add(n);
    }

    static void printSlots() {
        for (int i = 0; i < 11; i++) {
            OrderedList<Integer> list = slotMap.get(i);
            System.out.println("Slot " + i + ": " + (list == null ? "" : list.toString()));
        }
    }

    static void saveToFile(String fileName) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            List<String> allNumbers = new ArrayList<>();
            for (int i = 0; i < 11; i++) {
                OrderedList<Integer> list = slotMap.get(i);
                if (list != null && list.size() > 0) {
                    for (int j = 0; j < list.size(); j++) {
                        allNumbers.add(list.get(j).toString());
                    }
                }
            }
            writer.write(String.join(",", allNumbers));
        }
    }
}
