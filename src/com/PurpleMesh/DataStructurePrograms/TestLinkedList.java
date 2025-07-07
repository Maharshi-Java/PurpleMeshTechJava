package com.PurpleMesh.DataStructurePrograms;

import java.util.Scanner;

public class TestLinkedList {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Select Linked List Type:");
        System.out.println("1. Ordered Linked List");
        System.out.println("2. Unordered Linked List");
        int listType = scanner.nextInt();


 
        boolean isOrdered = (listType == 1);


        OrderedList<Integer> orderedList = null;
        UnorderedLists<Integer> unorderedList = null;


        if (isOrdered) {
            orderedList = new OrderedList<>();
            System.out.println("You selected Ordered Linked List.");
        } else {
            unorderedList = new UnorderedLists<>();
            System.out.println("You selected Unordered Linked List.");
        }


        int choice = 0;


        while (choice != 7) {
            System.out.println("\n========= MENU =========");
            System.out.println("1. Add");
            System.out.println("2. Remove");
            System.out.println("3. Search");
            System.out.println("4. Display");
            System.out.println("5. Get Size");
            System.out.println("6. Clear List");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");


            choice = scanner.nextInt();


            switch (choice) {
                case 1: 
                    System.out.print("Enter value to add: ");
                    int valToAdd = scanner.nextInt();
                    if (isOrdered) 
                    {
                    	orderedList.add(valToAdd);
                    }
                    	
                    else 
                    {
                    	unorderedList.add(valToAdd);
                    }
                    break;


                case 2: 
                    System.out.print("Enter value to remove: ");
                    int valToRemove = scanner.nextInt();
                    if (isOrdered) 
                    {
                    	orderedList.remove(valToRemove);
                    	System.out.println("Removed Sucessfully");
                    }
                    else 
                    {
                    	unorderedList.remove(valToRemove);
                    	System.out.println("Removed Sucessfully");
                    }
                    break;


                case 3: 
                    System.out.print("Enter value to search: ");
                    int valToSearch = scanner.nextInt();
                    boolean found = isOrdered ? orderedList.search(valToSearch) : unorderedList.search(valToSearch);
                    System.out.println(found ? "Value found." : "Value not found.");
                    break;


                case 4: 
                    String output = isOrdered ? orderedList.toString() : unorderedList.toString();
                    System.out.println("List: " + output);
                    break;


                case 5: 
                    int size = isOrdered ? orderedList.size() : unorderedList.size();
                    System.out.println("Size: " + size);
                    break;


                case 6: 
                    if(isOrdered) 
                    {
                    	orderedList.clear();
                    }
                    else
                    {
                    	unorderedList.clear();
                    }
                    System.out.println("List cleared.");
                    break;


                case 7: 
                    System.out.println("Exiting program.");
                    break;


                default:
                    System.out.println("Invalid choice Please select a valid option (1-7).");
            }
        }


        scanner.close();
    }
}




