package com.PurpleMesh.Utility;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

public class Utility {

    // Constants and static members for scanner, random, and Jackson ObjectMapper
    static final int MOD = 100000007;
    public static final Scanner scanner = new Scanner(System.in);
    public static final Random random = new Random();
    public static final PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(System.out), true);
    public static final ObjectMapper mapper = new ObjectMapper();
    
    static {
        // Registering JavaTimeModule for handling Java 8 Date/Time API types
        mapper.registerModule(new JavaTimeModule());
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    }

    // Get next integer from user input
    public static int getNextInt() {
        int number = -1;
        boolean valid = false;
        while (!valid) {
            try {
                number = scanner.nextInt();
                scanner.nextLine(); // Consume the newline
                valid = true;
            } catch (Exception e) {
                printWriter.println("Invalid input. Please enter a valid integer.");
                scanner.nextLine(); // Clear the buffer
            }
        }
        return number;
    }

    // Get next string (line) from user input
    public static String getNextLine() {
        return scanner.nextLine();
    }

    // Get next line from user input (alternative method)
    public static String getNext() {
        return scanner.nextLine();
    }

    // Get next double from user input
    public static double getNextDouble() {
        double numDouble = -1;
        boolean valid = false;
        while (!valid) {
            try {
                numDouble = scanner.nextDouble();
                scanner.nextLine(); // Consume the newline
                valid = true;
            } catch (Exception e) {
                printWriter.println("Invalid input. Please enter a valid double.");
                scanner.nextLine(); // Clear the buffer
            }
        }
        return numDouble;
    }

    // Get next boolean from user input
    public static boolean getNextBoolean() {
        boolean s = false;
        boolean valid = false;
        while (!valid) {
            try {
                s = scanner.nextBoolean();
                valid = true;
            } catch (Exception e) {
                printWriter.println("Invalid input. Please enter a valid boolean.");
                scanner.nextLine(); // Clear the buffer
            }
        }
        return s;
    }

    // Generate a random integer between 0 and 9999
    public static int getRandomInt() {
        return random.nextInt(10000);
    }

    // Generate a random double between 0 and 1
    public static double getRandomDouble() {
        return random.nextDouble();
    }

    // Generate a random boolean value
    public static boolean getRandBoolean() {
        return random.nextBoolean();
    }

    // Reverse a given number and return the reversed value
    public static int reverseNumber(int number) {
        String reversedStr = new StringBuilder(String.valueOf(number)).reverse().toString();
        return Integer.parseInt(reversedStr);
    }

    // Reverse a given string and return the reversed string
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Check if a number is a prime number
    public static boolean isPrimeNumber(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Check if a number is a palindrome
    public static boolean isPalindrome(int num) {
        int rev = reverseNumber(num);
        return num == rev;
    }

    // Calculate the factorial of a number (with modulo)
    public static long factorial(long n) {
        long fact = 1;
        if (n == 0) {
            return 1;
        } else {
            for (int i = 1; i <= n; i++) {
                fact = (fact * i) % MOD;
            }
            return fact;
        }
    }

    // Check if two numbers are anagrams of each other
    public static boolean isAnagrams(int num1, int num2) {
        char[] arr1 = String.valueOf(num1).toCharArray();
        char[] arr2 = String.valueOf(num2).toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}
