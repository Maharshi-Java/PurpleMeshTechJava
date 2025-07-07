package com.PurpleMesh.AlgorithmPrograms;

import java.util.ArrayList;
import java.util.List;

import com.PurpleMesh.Utility.Utility;

<<<<<<< HEAD
public class PermutationsofString {
	
	
	
	public static void permutations(String word)
	{
		
		
	}

	public static void main(String[] args) {
		
		System.out.println("Enter A String:");
		String word = Utility.getNextLine();
		
		int lenght=word.length();
		StringBuilder sBuilder;
		
		for(int i=0;i<lenght;i++)
		{
			sBuilder = new StringBuilder();
			
			int m=i;
			int k=0;
			
			
			for(int j=m;j<word.length();j++)
			{
				sBuilder.insert(k, word.charAt(j));
				k++;
				m++;
				
				
			}
			m=0;
			while (m < i)
            {
				sBuilder.insert(k, word.charAt(m));
                m++;
                k++;
            }
			
			
			System.out.println(sBuilder);
		}
		
		

	}

=======
public class PermutationsofString {   
    static void recursivePermutations(String word, String ans) 
    {
        if (word.length() == 0) {
            System.out.println(ans);
            return;
        }
 
        for (int i = 0; i < word.length(); i++) 
        {
            char ch = word.charAt(i);
            String remaining = word.substring(0, i) + word.substring(i + 1);
            recursivePermutations(remaining, ans + ch);
        }
    }

    
    static List<String> iterativePermutations(String str) {
        List<String> result = new ArrayList<>();
        result.add(""); 
        for (char c : str.toCharArray()) {
            List<String> temp = new ArrayList<>();

            for (String s : result) {
                for (int i = 0; i <= s.length(); i++) {
                    temp.add(s.substring(0, i) + c + s.substring(i));
                }
            }

            result = temp;
        }

        return result;
    }                                          

    public static void main(String[] args) {
    	
    	System.out.println("Enter A word:");
        String word = Utility.getNextLine();

        
        System.out.println("Recursive Permutations:");
        recursivePermutations(word, "");

        System.out.println("Iterative Permutations:");
        List<String> permutations = iterativePermutations(word);
        for (String p : permutations) {
            System.out.println(p);
        }
    }
>>>>>>> 7a66887 (second commit)
}
