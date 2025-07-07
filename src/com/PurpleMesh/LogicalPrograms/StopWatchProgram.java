package com.PurpleMesh.LogicalPrograms;

import com.PurpleMesh.Utility.Utility;

public class StopWatchProgram {

	public static void main(String[] args) {
	
		System.out.println("Press Enter to Start:");
		Utility.getNextLine();
		
		long start=System.currentTimeMillis();
		
		System.out.println("Press Enter to Stop:");
		Utility.getNextLine();
		
		long stop= System.currentTimeMillis();
		
		long totlaTime=stop-start;
		
		long seconds=totlaTime/1000;
		long milliSeconds=totlaTime%1000;
		
		System.out.println("Time: "+seconds+" Seconds "+milliSeconds+" MilliSeconds");
		
		

	}

}
