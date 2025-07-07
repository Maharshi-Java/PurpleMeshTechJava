package com.PurpleMesh.OOPS;

import com.PurpleMesh.DataStructurePrograms.GenericQueue;

public class Player {
	
	private String name;
	private GenericQueue<Card> cardQueue;
	
	
	public Player(String name) {
        this.name = name;
        this.cardQueue = new GenericQueue<>();
    }
	
	public void receiveCard(Card card)
	{
		cardQueue.enqueue(card);
	}
	
	public void sortCardsByRank()
	{
		
		int size=cardQueue.size();
		
		Card[] cards = new Card[size];
		
		for (int i = 0; i < size; i++) {
            cards[i] = cardQueue.dequeue();
        }
		for (int i = 0; i < size - 1; i++) {
			
            for (int j = 0; j < size - i - 1; j++) {
            	
            	if(cards[j].compareTo(cards[j+1])>0)
            	{
            		Card tempCard=cards[j];
            		cards[j] = cards[j+1];
            		cards[j+1]=tempCard;
            	}
            	
            }
            	
        }
		
		for (Card card : cards) {
            cardQueue.enqueue(card);
        }   
		
	}
	
	public String getName() {
        return name;
    }
	
	public GenericQueue<Card> getCardQueue() {
        return cardQueue;
    }
	
	public void printCards() {
        System.out.println(name + "'s cards:");
        GenericQueue<Card> tempQueue = new GenericQueue<>();
        
        while(!cardQueue.isEmpty())
        {
        	Card card = cardQueue.dequeue();
        	System.out.println(card);
        	tempQueue.enqueue(card);
        }
        
        while (!tempQueue.isEmpty()) {
            cardQueue.enqueue(tempQueue.dequeue());
        }
	}

}
