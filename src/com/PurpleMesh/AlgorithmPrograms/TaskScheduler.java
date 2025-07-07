package com.PurpleMesh.AlgorithmPrograms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.PurpleMesh.Utility.Utility;

public class TaskScheduler {
 
	public static void main(String[] args) {
		System.out.println("Enter Number of Tasks:");
		int n=Utility.getNextInt();
		
		System.out.println("Enter Yours Tasks:");
		
		List<int[]> tasksList= new ArrayList<>();
		
		
		for(int i=0;i<n;i++)
		{
			int D= Utility.getNextInt();
			int M=Utility.getNextInt();
			
			tasksList.add(new int[] {D,M});
			
		}
		
		int result= minimizeOversoot(tasksList);
		System.out.println(result);

	}

	private static int minimizeOversoot(List<int[]> tasksList) {
		
		tasksList.sort(Comparator.comparingInt(a -> a[0]));
		
		int currentTime=0;
		int maxOversoot=0;
		for(int task[]: tasksList)
		{
			int D= task[0];
			int M= task[1];
			
			
			currentTime+=M;
			
			int overShoot=currentTime-D;
			
			if(overShoot>maxOversoot)
			{
				maxOversoot=overShoot;
			}
			
		}
		
		return maxOversoot;
	}

}
