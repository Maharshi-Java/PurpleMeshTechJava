package com.PurpleMesh.OOPS;

public class Card  implements Comparable<Card>{
	
	public String suit;
	public String rank;
	
	private static final String[] rankOrder = { 
	        "2", "3", "4", "5", "6", "7", "8", "9", "10", 
	        "Jack", "Queen", "King", "Ace" 
	    };
	
	 public Card(String rank, String suit) {
	        this.rank = rank;
	        this.suit = suit;
	    }
	

	public int getRankValue()
	{
		for(int i=0;i<rankOrder.length;i++)
		{
			if(rankOrder[i].equals(rank))
				return i;
		}
		return -1;
	}
	
	public int compareTo(Card o)
	{
		return Integer.compare(this.getRankValue(), o.getRankValue());
	}
	
	
    public String toString() {
        return rank + " of " + suit;
    }

}
