package com.PurpleMesh.AlgorithmPrograms;

import com.PurpleMesh.Utility.Utility;

public class FindYourNumber {
	
	private static int findNumber(int low ,int high)
	{
		if(low == high)
			return low;
		
		int mid=(low+high)/2;
		
        System.out.println("Is your number between " + low + " and " + mid + "? (true/false): ");
		
		boolean isNumeber=Utility.getNextBoolean();
		
		if(isNumeber)
		{
			return findNumber(low, mid);
		}
		else {
			return findNumber(mid+1, high);
		}
		

	}

	public static void main(String[] args) {
		
		System.out.println("Enter Value of N");
		int n=Utility.getNextInt();
		
		int N = (int)Math.pow(2, n);
		
		System.out.println("Enter number between "+ n +" and "+ N+": ");
		System.out.println("I will guess in "+n+ " Questions or less");
		
		
		int number = findNumber(0,N-1);
		System.out.println("Your Number is : "+number);
	}

}
