package com.PurpleMesh.BasicCorePrograms;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of times to Flip Coin");
		int flips= scanner.nextInt();
		
		if(flips<=0)
		{
			System.out.println("Enter Positive Number");
		}
		
		int heads=0,tails=0;
		for(int i=0;i<flips;i++)
		{
			double random= Math.random();
			if(random<0.5)
			{
				tails++;
				
			}
			else {
				heads++;
			}
			
		}
		
		double tailsPercentage= tails*100/flips;
		double headsPercentage= heads*100/flips;
		
		System.out.println("Tails Percentage: "+ tailsPercentage);
		System.out.println("Heads Percentage: "+ headsPercentage);
		scanner.close();
	}

}
