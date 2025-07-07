package com.PurpleMesh.BasicCorePrograms;

import com.PurpleMesh.Utility.Utility;

public class PrimeFactorization {

	public static void main(String[] args) {
        

        System.out.print("Enter a number to find prime factors: ");
        int n =Utility.getNextInt();

        System.out.print("Prime factors of " + n + " are: ");
        findPrimeFactors(n);

       
    }

    static void findPrimeFactors(int n) {
        
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }

    
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }


        if (n > 2) {
            System.out.print(n);
        }
    }
}



