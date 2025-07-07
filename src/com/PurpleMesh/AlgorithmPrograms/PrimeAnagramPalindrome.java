package com.PurpleMesh.AlgorithmPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;



import com.PurpleMesh.Utility.Utility;

public class PrimeAnagramPalindrome {

	
	
	
	
	public static void main(String[] args) {
		
		List<Integer> primeNumbers = new ArrayList<Integer>();
        Set<Integer> anagramNumbers = new HashSet<Integer>();
        Set<Integer> palindromeNumbers= new HashSet<Integer>();

        System.out.println("Prime Numbers");
		for(int i=2;i<1000;i++)
		{
			if(Utility.isPrimeNumber(i))
			{
				primeNumbers.add(i);
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
		
		
		Iterator< Integer> itrIterator = primeNumbers.iterator();
		System.out.println("Palindrome Numbers");
		while(itrIterator.hasNext())
		{
			Integer num=itrIterator.next();
		    if(Utility.isPalandrome(num)) {
		    	System.out.print(num+" ");
		    	palindromeNumbers.add(num);
		    }
		}
		
		System.out.println("Anagrams ");
		for(int i=0;i<primeNumbers.size();i++)
		{
			for(int j=0;j<primeNumbers.size();j++)
			{
				int num1=primeNumbers.get(i);
				int num2=primeNumbers.get(j);
				if(Utility.isAnagrams(num1, num2))
				{
					System.out.println(num1+ "<-->"+ num2);
					anagramNumbers.add(num1);
					anagramNumbers.add(num2);
				}
			}
		}
		
		Set<Integer> commonNumbers = new HashSet<>(primeNumbers);
        commonNumbers.retainAll(anagramNumbers);
        commonNumbers.retainAll(palindromeNumbers);
        System.out.println("Common in Both Palindrome And Anagrams" );
        System.out.println(commonNumbers);
			
	}
	

	

}
