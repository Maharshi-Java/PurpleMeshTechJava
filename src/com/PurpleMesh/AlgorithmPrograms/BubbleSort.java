package com.PurpleMesh.AlgorithmPrograms;

import com.PurpleMesh.Utility.Utility;

public class BubbleSort {

	public static void main(String[] args) {
		
		System.out.println("Enter N value:");
		int n=Utility.getNextInt();
		
		System.out.println("Enter "+n +" Numbers");
		int[] array=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]= Utility.getNextInt();
		}
		
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(array[j]>array[j+1])
				{
					int temp= array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}

	   System.out.println("Sorted Array: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(array[i]+" ");
		}
		
	}

}
