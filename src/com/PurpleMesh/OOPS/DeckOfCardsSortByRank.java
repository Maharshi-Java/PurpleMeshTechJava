package com.PurpleMesh.OOPS;

import java.util.Random;

import com.PurpleMesh.DataStructurePrograms.GenericQueue;

public class DeckOfCardsSortByRank {
	
	
	private static final	String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
	private static final    String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

	private static void suffleDesk(Card[] desk)
	{
		Random random=new Random();
		for(int i=0;i<desk.length;i++)
		{
			int r=random.nextInt(desk.length);
			Card temp=desk[i];
			desk[i]=desk[r];
			desk[r]=temp;
			 
			
		}
		
	}
	public static void main(String[] args) {
		
		Card[] desk = new Card[52];

		int index = 0;

		for (String suit : suits) {
            for (String rank : ranks) {
                desk[index++] = new Card(rank, suit);
            }
        }
		
		suffleDesk(desk);
		
		
		GenericQueue<Player> playerQueue= new GenericQueue<Player>();
		
		for(int i=1;i<4;i++)
		{
			playerQueue.enqueue(new Player("Player"+ i));
		}
		
		int deskIndex=0;
		for(int i=0;i<9;i++)
		{
			int players=playerQueue.size();
			for(int j=0;j<players;j++)
			{
				Player player=playerQueue.dequeue();
				player.receiveCard(desk[deskIndex++]);
				playerQueue.enqueue(player);
				
			}
		}
		
		
		while (!playerQueue.isEmpty()) {
            Player player = playerQueue.dequeue();
            player.sortCardsByRank();
            player.printCards();
            System.out.println();
        }
		
	}
	

}
