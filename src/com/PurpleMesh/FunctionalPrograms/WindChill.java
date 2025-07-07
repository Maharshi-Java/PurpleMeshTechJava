package com.PurpleMesh.FunctionalPrograms;

import com.PurpleMesh.Utility.Utility;

public class WindChill {

	public static void main(String[] args) {
		
		System.out.println("Enter T Value: ");
		double t=Utility.getNextDouble();
		
		System.out.println("Enter V Value: ");
		double v=Utility.getNextDouble();

		
		double windChill= 35.74 + (0.6215 * t) +
                (0.4275 * t - 35.75) * Math.pow(v, 0.16);
		
		System.out.println("Wind Chill: "+ windChill);

	}

}
