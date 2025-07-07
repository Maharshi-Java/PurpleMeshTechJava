package com.PurpleMesh.BasicCorePrograms;

import com.PurpleMesh.Utility.Utility;

public class HarmonicNumber {

	public static void main(String[] args) {
		
		
		System.out.println("Enter Value of N");
		int number= Utility.getNextInt();
		double result=0.0;
		if(number!=0)
		{
			for(int i=1;i<=number;i++)
			{
				result += 1.0/i;
				
						
			}
		}
		else {
			System.out.println("Enter a Valid Number");
		}
		System.err.println("Nth Harmonic Value: "+ result);
		
	}

}