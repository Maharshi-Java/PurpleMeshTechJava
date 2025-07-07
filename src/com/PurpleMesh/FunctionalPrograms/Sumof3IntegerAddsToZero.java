package com.PurpleMesh.FunctionalPrograms;

import com.PurpleMesh.Utility.Utility;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class Sumof3IntegerAddsToZero {

	public static void main(String[] args) {
		
		System.out.println("Enter N values:");
		int N=Utility.scanner.nextInt();
		
		System.out.println("Enter "+N +" Numbers");
		int[] numbers = new int[N];
		for(int i=0;i<N;i++)
		{
			numbers[i] = Utility.scanner.nextInt();
		}
		
		Set<String> seenTriplets = new HashSet<>();
		int count=0;
		for(int i=0;i<N;i++)
		{
			for(int j=i+1;j<N;j++)
			{
				for(int k=j+1;k<N;k++)
				{
					if(numbers[i]+numbers[j]+numbers[k] == 0)
					{
						int[] triplet = {numbers[i], numbers[j], numbers[k]};
                        Arrays.sort(triplet);
                        String key = triplet[0] + "," + triplet[1] + "," + triplet[2];

                        if (!seenTriplets.contains(key)) {
                            seenTriplets.add(key);
                            System.out.println(triplet[0] + " " + triplet[1] + " " + triplet[2]);
                            count++;
                        }
					}
				}
			}
		}
		
		System.out.println("Triples: "+count);

	}

}
