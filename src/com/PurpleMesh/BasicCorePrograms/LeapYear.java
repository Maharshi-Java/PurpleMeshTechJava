package com.PurpleMesh.BasicCorePrograms;

import com.PurpleMesh.Utility.Utility;

public class LeapYear {

	public static void main(String[] args) {

		System.out.println("Enter a Year: ");
		int year = Utility.getNextInt();
		int temp=year;
		int length=0;
		int rem=0;
		while(temp>0)
		{
			rem=rem%10; 
			length++;
			temp=temp/10;
			
		}
		if (length != 4) {
			System.out.println("Entered  Year is Incorrect : YYYY");
		} else {
			if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
				System.out.println("Given Year :" + year + " is Leap Year");
			} else {
				System.out.println("Given Year :" + year + " is Not Leap Year");
			}
		}

	}
}