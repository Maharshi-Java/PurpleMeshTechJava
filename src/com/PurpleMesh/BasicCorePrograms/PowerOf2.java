package com.PurpleMesh.BasicCorePrograms;

import com.PurpleMesh.Utility.Utility;

public class PowerOf2 {

	public static void main(String[] args) {
		
		
		System.out.println("Enter power Value: ");
	      int number=Utility.getNextInt();
	      double result=1;
	      if(number<=0 || number>31)
	      {
	    	  System.out.println("Enter Number between 1 to 31");
	      }
	      else {
	    	  
	    	  double powOfNumber= Math.pow(2, number);
		      System.out.println("power of 2^"+number+"="+powOfNumber);
		      System.out.println();
		      
		      for(int i=1;i<=number;i++)
		      {
		    	  result=Math.pow(2,i);
		    	  if(result<= powOfNumber)
		    	  {
		    		  System.out.println("Power of 2^"+i+"="+result);
		    	  }
		    	  
		      }
	      }
	     
	      
	 

	}

}
