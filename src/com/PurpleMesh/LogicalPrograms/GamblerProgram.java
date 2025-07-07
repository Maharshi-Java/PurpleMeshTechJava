package com.PurpleMesh.LogicalPrograms;

import com.PurpleMesh.Utility.Utility;

public class GamblerProgram {

	public static void main(String[] args) {
		System.out.println("Enter Stack Amount:");
		int stack=Utility.getNextInt();
		
		System.out.println("Enter Goal Amount:");
		int goal=Utility.getNextInt();
		
		System.out.println("Enter Number of Trails:");
		int trials=Utility.getNextInt();
		
		int totalBeats=0;
		int totalWins=0;
		
		for(int i=0;i<trials;i++)
		{
			int cash=stack;
			
			while(cash>0 && cash<goal)
			{
				totalBeats++;
				
				if(Utility.getRandBoolean())
				{
					cash++;
				}
				else {
					cash--;
				}
				
			}
			
			if(cash == goal)
				totalWins++;
		}
		
		System.out.println("Total Wins: "+totalWins);
		System.out.println("Total Beats:"+totalBeats);
		System.out.println("Win Percentage   : " + (100.0 * totalWins / trials) + " %");
        System.out.println("Loss Percentage  : " + (100.0 * (trials - totalWins) / trials) + " %");

	}

}
