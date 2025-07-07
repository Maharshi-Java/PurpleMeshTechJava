package com.PurpleMesh.AlgorithmPrograms;

import com.PurpleMesh.Utility.Utility;

class PrimeNumbersCheck {
	
	
	public static void main(String[] args) {
		
		
		for(int i=2;i<1000;i++)
		{
			if(Utility.isPrimeNumber(i))
			{
				System.out.print(i+ " ");
			}
		}

	}

	

}
