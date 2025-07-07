package com.PurpleMesh.Utility;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;
<<<<<<< HEAD

public class Utility {

	public static final Scanner scanner = new Scanner(System.in);
	
	public static final ObjectMapper mapper = new ObjectMapper(); 
	
	public static int getNextInt()
	{
		int number=scanner.nextInt();
		scanner.nextLine();
=======
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

public class Utility {
	static final int mod = 100000007;
	public static final Scanner scanner = new Scanner(System.in);
	
	public static final ObjectMapper mapper = new ObjectMapper(); 
	static {
        mapper.registerModule(new JavaTimeModule());
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    }
	
	public static int getNextInt() 
	{
		int number=scanner.nextInt();
>>>>>>> 7a66887 (second commit)
		return number;
	}
	
	public static String getNextLine()
	{
		String nameString=scanner.nextLine();
		return nameString;
		
	}
	public static String getNext()
	{
		String nameString=scanner.nextLine();
		return nameString;
		
	}
	public static double getNextDouble()
	{
		double numDouble=scanner.nextDouble();
		return numDouble;
	}
	public static boolean getNextBoolean() {
		boolean s = scanner.nextBoolean();
		return s;
	}

	 
	public static final Random random = new Random();
	
	public static int getRandomInt() {
		int ranvalue = random.nextInt(10000);

		return ranvalue;

	}
	public static double getRandomDouble() {
		double pointvalue = random.nextDouble();
		return pointvalue;
	}
	
    public static boolean getRandBoolean()
    {
    	boolean boolValue= random.nextBoolean();
    	return boolValue;
    }

	public static int reverseNumber(int number) {
        String reversedStr = new StringBuilder(String.valueOf(number)).reverse().toString();
        return Integer.parseInt(reversedStr);
    }
	
	public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
	
	public static final PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(System.out),true);
	
	public static boolean isPrimeNumber(int num) {
<<<<<<< HEAD
		if(num<2) return false;
		if(num == 2 ) return true;
		if (num % 2 == 0) return false;
=======
		if(num<2) 
			return false;
		if(num == 2 ) 
			return true;
		if (num % 2 == 0) 
			return false;
>>>>>>> 7a66887 (second commit)
		for(int i=3;i<num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static boolean isPalandrome(int num)
	{
		int rev = Utility.reverseNumber(num);
		if(num == rev)
		{
			return true;
		}
		
	return false;
	}
	
<<<<<<< HEAD
=======
	public static long factorials(long n)
	 {
		
		long fact=1;
		if(n==0)
		{
			return 1;
		}
		else {
			
			for(int i=1;i<=n;i++)
			{
			fact=(fact*i)%mod;
			}
			return fact;
		}
		
			
	 }
>>>>>>> 7a66887 (second commit)
	 public static boolean isAnagrams(int num1,int num2)
	{
		char[] arr1= String.valueOf(num1).toCharArray();
		char[] arr2= String.valueOf(num2).toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(Arrays.equals(arr1, arr2))
		{
			return true;
		}
		return false ;
	}

<<<<<<< HEAD
=======
	 
>>>>>>> 7a66887 (second commit)
	
}
