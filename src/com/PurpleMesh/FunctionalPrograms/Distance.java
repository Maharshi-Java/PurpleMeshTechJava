package com.PurpleMesh.FunctionalPrograms;

import com.PurpleMesh.Utility.Utility;

public class Distance {

	public static void main(String[] args) {
//		if (args.length != 2) {
//            System.out.println("Please provide exactly 2 integers.");
//            return;
<<<<<<< HEAD
//        }
=======
//        } 
>>>>>>> 7a66887 (second commit)
//		int x = Integer.parseInt(args[0]);
//        int y = Integer.parseInt(args[1]);
//        
        
        int x=Utility.scanner.nextInt();
        int y=Utility.scanner.nextInt();
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        System.out.println("Distance from (0,0) to (" + x + "," + y + ") is: " + distance);

	}

}
