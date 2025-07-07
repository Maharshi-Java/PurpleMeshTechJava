package com.PurpleMesh.DataStructurePrograms;

import com.PurpleMesh.Utility.Utility;

public class PalindromeGenericQueue {

	public static void main(String[] args) {
		
		GenericQueue<String> queue= new GenericQueue<>();
		System.out.println("Enter A word");
		String word = Utility.getNext();
		
		queue.enqueue(word);
		
		String s1= queue.peek();
		String temp =s1;
		char [] CharArray= s1.toCharArray();
		
		
		GenericQueue<Character> q= new GenericQueue<Character>();
		
		for(int i=0;i<CharArray.length;i++)
		{
			q.enqueue(CharArray[i]);
			
			
		}
		
		
		
		System.out.println();
	    StringBuilder sBuffer=new StringBuilder();
		for(int i=0;i<CharArray.length;i++)
		{
			char ch=q.dequeueLast();
			sBuffer.append(ch);
		}
		
		
		if(temp.equals(sBuffer.toString())) {
			
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
		
		

	}

}
