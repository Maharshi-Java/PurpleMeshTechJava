package com.PurpleMesh.AlgorithmPrograms;

import java.io.NotActiveException;
import java.util.Arrays;

import com.PurpleMesh.Utility.Utility;

public class Anagram {

	public static void main(String[] args) {
		
		System.out.println("Enter First String:");
		String s1= Utility.getNext();
		System.out.println("Enter Second String:");
		String s2= Utility.getNext();
		
		s1.toLowerCase();
		s2.toLowerCase();
		 char[] arr1= s1.toCharArray();
		 char[] arr2=s2.toCharArray();
		 
		 Arrays.sort(arr1);
		 Arrays.sort(arr2);
		 
		 String sortedArray1= new String(arr1);
		 String sortedArray2= arr2.toString();
		 
		 if(sortedArray1.compareTo(sortedArray2) == 0) {
			 System.out.println("Anagrams");
			 
		 }else {
			System.out.println("Not Anagrams:");
		}

		 
		

	}

}
