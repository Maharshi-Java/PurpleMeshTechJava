package com.PurpleMesh.OOPS;

import java.util.Random;


public class DeckOfCards {

	private static void suffleDesk(String[] desk)
	{
		Random random=new Random();
		for(int i=0;i<desk.length;i++)
		{
			int r=random.nextInt(desk.length);
			String temp=desk[i];
			desk[i]=desk[r];
			desk[r]=temp;
<<<<<<< HEAD
			
=======
			 
>>>>>>> 7a66887 (second commit)
			
		}
		
	}
	public static void main(String[] args) {
		String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
        String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
        
        
        String[] desk = new String[52];
        
        int index=0;
        
        for(int i=0;i<suits.length;i++)
        {
        	for(int j=0;j<ranks.length;j++)
        	{
        		desk[index]= ranks[j]+" of "+suits[i];
        		index++;
        		
        	}
        }
        suffleDesk(desk);
        String[][] players = new String[4][9];
        int cardIndex=0;
        for(int i=0;i<4;i++)
        {
        	for(int j=0;j<9;j++)
        	{
        		players[i][j]= desk[cardIndex];
        		cardIndex++;
        	}
        }
        
        
        
       for(int i=0;i<4;i++)
       {
    	   System.out.println("Player:"+(i+1)+" Cards:");
    	   for(int j=0;j<9;j++)
    	   {
    		   System.out.println(players[i][j]);
    	   }
    	   System.out.println();
       }


	}

}
