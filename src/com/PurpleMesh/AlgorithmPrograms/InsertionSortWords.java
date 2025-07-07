package com.PurpleMesh.AlgorithmPrograms;

import com.PurpleMesh.Utility.Utility;

public class InsertionSortWords {

	public static void main(String[] args) {
		System.out.print("Enter number of words: ");
        int n = Utility.getNextInt();
<<<<<<< HEAD
        Utility.getNextLine();
=======
       
>>>>>>> 7a66887 (second commit)
       
        String[] words = new String[n];
        System.out.println("Enter the words:");
        for (int i = 0; i < n; i++) {
            words[i] = Utility.getNextLine();
        }

       
        for (int i = 1; i < n; i++) {
            String current = words[i];
<<<<<<< HEAD
=======
            
>>>>>>> 7a66887 (second commit)
            int j = i - 1;
            while (j >= 0 && current.compareTo(words[j]) < 0) {
                words[j + 1] = words[j];
                j--;
            }
            words[j + 1] = current;
        }

        System.out.println("Sorted words:");
        for (int i = 0; i < n; i++) {
            System.out.println(words[i]);
        }

      
	}

}
