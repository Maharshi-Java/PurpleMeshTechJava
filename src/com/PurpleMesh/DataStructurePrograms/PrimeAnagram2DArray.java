package com.PurpleMesh.DataStructurePrograms;

import java.util.Arrays;

import com.PurpleMesh.Utility.Utility;

public class PrimeAnagram2DArray {
	
	public static void main(String[] args) {
		
	GenericList<Integer> allPrimes = new GenericList<>();

	
	for(int i=0;i<=1000;i++)
	{
		if(Utility.isPrimeNumber(i) )
		{
			allPrimes.add(i);
		}
	}
	
	GenericList<Integer> anagramPrimes = new GenericList<>();
    GenericList<Integer> nonAnagramPrimes = new GenericList<>();
	
	GenericList.Node<Integer> outer= allPrimes.getHead();
	
	while(outer !=null)
	{
		boolean hasAnagram=false;
		String outerdSorted= getSortedString(outer.dataT);
		
		GenericList.Node<Integer> inner= allPrimes.getHead();
		while(inner !=null)
			
		{
			if(!outer.dataT.equals(inner.dataT))
			{
				String innerSorted = getSortedString(inner.dataT);
				
				if(outerdSorted.equals(innerSorted))
				{
					hasAnagram=true;
					break;
				}
			}
			inner=inner.nextNode;
		}
		
		if(hasAnagram)
		{
<<<<<<< HEAD
			if (!anagramPrimes.contains(outer.dataT)) {
=======
			if (!anagramPrimes.search(outer.dataT)) {
>>>>>>> 7a66887 (second commit)
				anagramPrimes.add(outer.dataT);
			}
		}
		else {
<<<<<<< HEAD
			if(!nonAnagramPrimes.contains(outer.dataT))
=======
			if(!nonAnagramPrimes.search(outer.dataT))
>>>>>>> 7a66887 (second commit)
			{
				nonAnagramPrimes.add(outer.dataT);
			}
		}
		outer=outer.nextNode;
		
	}
	System.out.println("Primes with Anagram pairs:");
	anagramPrimes.printList();
	
	System.out.println("Primes without Anagram pairs:");
	nonAnagramPrimes.printList();
	
	
	    

}
	private static String getSortedString(int num) {
        char[] chars = String.valueOf(num).toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
