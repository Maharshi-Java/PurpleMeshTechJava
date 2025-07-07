package com.PurpleMesh.LogicalPrograms;

import java.util.HashSet;
import java.util.Random;
<<<<<<< HEAD
import java.util.Set;
=======
import java.util.Set;  
>>>>>>> 7a66887 (second commit)

import com.PurpleMesh.Utility.Utility;

public class CoupunNumber {

	Set<Integer> coupons = new HashSet<Integer>();

	
	private static int randomNumber(int n) {
        Random rand = new Random();
        int num=rand.nextInt(n);
        return num ;  
    }
	
	private static int collectCoupons(int n)
	{
		Set<Integer> collected = new HashSet<Integer>();
		
		int totalRandomNumbers=0;
		
		while(collected.size()<n)
		{
			int coupon=randomNumber(n);
			System.out.print(coupon+" ");
			totalRandomNumbers++;
			collected.add(coupon);
		}
		System.out.println();
		return totalRandomNumbers;
	}
	public static void main(String[] args) {
		
		
		System.out.println("Enter your  Coupon Number:");
		int n=Utility.getNextInt();
		
		
		int result=collectCoupons(n);
		Set<Integer> coupons = new HashSet<Integer>();
        System.out.println("Total random numbers generated to collect all " + n + " coupons: " + result);

	}

}
