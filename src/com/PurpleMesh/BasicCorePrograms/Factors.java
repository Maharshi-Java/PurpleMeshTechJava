package com.PurpleMesh.BasicCorePrograms;

import com.PurpleMesh.Utility.Utility;

public class Factors {
	
	
	public static long sumofPrimes(int number) {
		
		long sum=1;
		for(int i=2;i<number;i++)
		{
			
			if(number%i==0 && isPrime(i))
			{
				System.out.println(i);
				
			}
			else {
				System.out.println("Given number has no exact sum of prime numbers");
				break;
			}
			
		}
		return sum;
	} 
	public static boolean isPrime(int num) {
		if(num<=1)
		{
			return false;
		}
		for(int i=2; i*i <=num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		Utility utility = new Utility();
		System.out.println("Enter Number: ");
		int number = utility.getNextInt();
		 
		sumofPrimes(number);
		
	
	}

}
