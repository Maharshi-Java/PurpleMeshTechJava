package com.PurpleMesh.DataStructurePrograms;

public class UnorderedLists<T> {
	
	private Node<T> head;
	private int size;
	
	public void add(T data)
	{
		Node<T> newNode = new Node<>(data);
		if(head == null) {
			head =newNode;
		}
		else {
			Node<T> tempNode=head;
			while(tempNode.next != null)
			{
				tempNode=tempNode.next;
			}
			tempNode.next=newNode;
		}
		size++;
	}
	
	public boolean search(T data)
	{
		Node<T> tempNode=head;
		
		while(tempNode !=null)
		{
			if(tempNode.data.equals(data))
			{
				return true;
			}
			tempNode=tempNode.next;
		}
		return false;
	}

	
	public void remove(T data)
	{
		if(head == null)
			return;
		if(head.data.equals(data))
		{
			head=head.next;
			size--;
			return;
		}
		
		Node<T> tempNode=head;
		while(tempNode.next !=null && !tempNode.next.data.equals(data))
		
			tempNode=tempNode.next;
		
		if(tempNode.next !=null) {
			tempNode.next = tempNode.next.next;
			size--;
		}
	}
	
	public boolean isEmpty()
	{
		return head==null;
	}
	
	public int size() {
        return size;
    }
	
	public void clear() {
        head = null;
        size = 0;
    }
	
	public T get(int index)
	{
		if(index<0 && index>=size)
		{
			 throw new IndexOutOfBoundsException("Index out of bounds");
		}
		
		Node<T> currentNode=head;
		int count=0;
		while(currentNode!=null)
		{
			
			if(count==index)
				return currentNode.data;
			count++;
			currentNode=currentNode.next;
		}
		return null;
		
	}
	
	public String toString()
	{
		StringBuilder sBuilder =new StringBuilder();
		Node<T> tempNode=head;
		while(tempNode !=null) {
			sBuilder.append(tempNode.data).append(" ");
			tempNode=tempNode.next;
		}
		
		return sBuilder.toString().trim();
				
	}
	
	
}
