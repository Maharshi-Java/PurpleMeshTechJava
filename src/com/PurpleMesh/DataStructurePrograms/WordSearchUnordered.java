package com.PurpleMesh.DataStructurePrograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import com.PurpleMesh.Utility.Utility;

public class WordSearchUnordered {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Enter the word to search");
		String searchWord = Utility.getNextLine();
		
		String fileName = "unorderedlist.txt";
		
		 String[] wordArray=null;
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			String words = reader.readLine();
			wordArray=words.split(",");
			reader.close();
		} catch (IOException e) {
			System.out.println("Error reading file: "+ e.getMessage());
		}
		
		if (wordArray == null) {
            System.out.println("Word list is empty or file not read correctly.");
            return;
        }
		
		List<String> list = new LinkedList<>(Arrays.asList(wordArray));
		
	
		
		if(list.contains(searchWord))
		{
			 list.remove(searchWord);
			 System.out.println("Word is removed "+searchWord);
		}
	 else {
            list.add(searchWord);
            System.out.print("Word added: " + searchWord+" ");
        }
		
         
	for(String word:list)
	{
		System.out.println(word);
	}
		
	FileWriter writer = new FileWriter(fileName);
	writer.write(String.join(",", list));
	writer.close();
			
		
			
		
		
	}

}
