package com.PurpleMesh.FunctionalPrograms;

import com.PurpleMesh.Utility.Utility;

public class Quadratic {

	public static void main(String[] args) {
		
		System.out.println("Enter A value: ");
		double a=Utility.getNextDouble();
		
		System.out.println("Enter B value: ");
		double b=Utility.getNextDouble();
		
		System.out.println("Enter C value: ");
		double c=Utility.getNextDouble();
		
		double delta=(b*b - 4*a*c);
		
		
		if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("First Root Equation:  "+ root1);
    		System.out.println("First Root Equation:  "+ root2);
    		
        } else if (delta == 0) {
            double root = -b / (2 * a);
            System.out.println("Root: " + root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-delta) / (2 * a);
            System.out.println("First Root: " + realPart );
            System.out.println("Second Root: " + imaginaryPart);
        }
	}

}
