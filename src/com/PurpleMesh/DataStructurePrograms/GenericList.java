package com.PurpleMesh.DataStructurePrograms;

public class GenericList<T> {
	
	
 
 static class Node<T>{
		T dataT;
		Node<T> nextNode;
		public Node(T dataT) {
		this.dataT=dataT;
			
			
		}

	}

	private Node<T> headNode;
<<<<<<< HEAD
	
=======
	int size = 0;
>>>>>>> 7a66887 (second commit)
	
	public void add(T item)
	{
		Node<T> node = new Node<>(item);
<<<<<<< HEAD
		int size = 0;
=======
		
>>>>>>> 7a66887 (second commit)
		if(headNode == null) {
			headNode = node;
		}
		else {
			
			Node<T> tempNode=headNode;
			
			while(tempNode.nextNode!=null)
			{
				tempNode = tempNode.nextNode;
			}
			tempNode.nextNode=node;
			size++;
		}
		
	}
	
<<<<<<< HEAD
	public boolean contains(T item)
=======
	public boolean search(T item)
>>>>>>> 7a66887 (second commit)
	{
		
		Node<T> currentNode= headNode;
		while(currentNode!=null)
		{
			if(currentNode.dataT.equals(item))
				return true;
			currentNode=currentNode.nextNode;
		}
		return false;
	}
<<<<<<< HEAD
	
=======
	public void remove(T data)
	{
		if(headNode == null)
			return;
		if(headNode.dataT.equals(data))
		{
			headNode=headNode.nextNode;
			size--;
			return;
		}
		
		Node<T> tempNode=headNode;
		while(tempNode.nextNode !=null && !tempNode.nextNode.dataT.equals(data))
		
			tempNode=tempNode.nextNode;
		
		if(tempNode.nextNode !=null) {
			tempNode.nextNode = tempNode.nextNode.nextNode;
			size--;
		}
	}
>>>>>>> 7a66887 (second commit)
	public int size() {
	    int count = 0;
	    Node<T> current = headNode;
	    while (current != null) {
	        count++;
	        current = current.nextNode;
	    }
	    return count;
	}
	
	public Node<T> getHead() {
        return headNode;
    }
	
	public T get(int index) {
	    int count = 0;
	    Node<T> current = headNode;
	    while (current != null) {
	        if (count == index) {
	            return current.dataT;
	        }
	        count++;
	        current = current.nextNode;
	    }
	    throw new IndexOutOfBoundsException("Index: " + index);
	}
	
	public void printList()
	{
		Node<T> currentNode=headNode;
		
		while(currentNode != null)
		{
			System.out.print(currentNode.dataT+" ");
			currentNode=currentNode.nextNode;
		}
		System.out.println();
	}
	
<<<<<<< HEAD
=======
	public String toString()
	{
		StringBuilder sBuilder =new StringBuilder();
		Node<T> tempNode=headNode;
		while(tempNode !=null) {
			sBuilder.append(tempNode.dataT).append(" ");
			tempNode=tempNode.nextNode;
		}
		
		return sBuilder.toString().trim();
				
	}
>>>>>>> 7a66887 (second commit)

}
