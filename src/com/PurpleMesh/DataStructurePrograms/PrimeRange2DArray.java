package com.PurpleMesh.DataStructurePrograms;

import com.PurpleMesh.Utility.Utility;

public class PrimeRange2DArray {
	
	
	public static void main(String[] args) {
	
		
		GenericList<Integer>[] primeList = new GenericList[10];
		
		
		for(int i=0;i<10;i++)
		{
			primeList[i] = new GenericList<Integer>();
		}
		
		for(int i=0;i<=1000;i++)
		{
			if(Utility.isPrimeNumber(i) )
			{
				int rangeIndex=i/100;
				primeList[rangeIndex].add(i);
			}
		}
		
		for(int i=0;i<primeList.length;i++)
		{
			int s=i*100;
			int e=s+100;
			System.out.println("Primes in Range"+ s+"to "+e+" :");
			primeList[i].printList();
		}
	
	}

}
