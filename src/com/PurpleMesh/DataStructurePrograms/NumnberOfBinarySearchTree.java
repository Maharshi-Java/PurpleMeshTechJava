package com.PurpleMesh.DataStructurePrograms;

import com.PurpleMesh.Utility.Utility;

// (2n)!/(n+1)!*n!;


public class NumnberOfBinarySearchTree {
	
	 static final int MOD = 100000007;

	public static void main(String[] args)  
	{
	
		System.out.println("Enter Number of Nodes T:");
		
		int t=Utility.getNextInt();
		
		System.out.println("Enter Nodes: ");
		int[] nodes= new int[t];
		
		for(int i=0;i<t;i++)
		{
			nodes[i]=Utility.getNextInt();
		}
		
		System.out.println("Output:");
		for(int i=0;i<t;i++) {
			
		int j=nodes[i]; 
		long top= Utility.factorials(2*j);
		long b1=Utility.factorials(j+1);
		long b2=Utility.factorials(j);
		long bottom=b1*b2;
		
		long result = (top * modInverse(bottom)) % MOD;
		
		System.out.println(result);
		
				
				
		}
		
	}
	public static long modInverse(long a) {
        return power(a, MOD - 2);
    }
	 public static long power(long x, long y) {
	        long result = 1;
	        x = x % MOD;
	        while (y > 0) {
	            if ((y & 1) == 1)
	                result = (result * x) % MOD;
	            y = y >> 1;
	            x = (x * x) % MOD;
	        }
	        return result;
	    }

}
