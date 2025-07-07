package com.PurpleMesh.AlgorithmPrograms;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

<<<<<<< HEAD
import java.util.Arrays;

import com.PurpleMesh.Utility.Utility;

public class BinarySearchWord {
=======
import com.PurpleMesh.Utility.Utility;

public class BinarySearchWord { 
>>>>>>> 7a66887 (second commit)

	public static void main(String[] args) {
		
		System.out.println("Enter the word to search");
		String searchWord = Utility.getNextLine();
		
		String fileName = "words.txt";
		 String[] words = null;
		 
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			String line = reader.readLine();
			if (line != null && !line.trim().isEmpty()) {
                words = line.split(","); 
            }
			reader.close();
			
		} catch (IOException e) {
			System.out.println("Error reading file: "+ e.getMessage());
		}
		
		if (words == null) {
            System.out.println("Word list is empty or file not read correctly.");
            return;
        }
		
		
<<<<<<< HEAD
		int index= Arrays.binarySearch(words, searchWord);
		
		if (index >= 0) {
            System.out.println("Word found at index: " + index);
        } else {
            System.out.println("Word not found.");
        }
=======
//		int index= Arrays.binarySearch(words, searchWord);
		
		int low=0;
		int high=words.length-1;
		
		
		boolean found= false;
		
		while(low<=high)
		{
			int mid=low+(high-low)/2;
			int compare=searchWord.compareTo(words[mid]);
			if(compare ==0)
			{
				found=true;
				break;
			}
			else if(compare >0)
			{
				low=mid+1;
				
			}
			else {
				high=mid-1;
			}
		}
		if(found) {
			System.out.println("Word Found");
		}
		else {
			System.out.println("Word not found");
		}
			
				
		
//		if (index >= 0) {
//            System.out.println("Word found at index: " + index);
//        } else {
//            System.out.println("Word not found.");
//        }
>>>>>>> 7a66887 (second commit)
		

	}

}
