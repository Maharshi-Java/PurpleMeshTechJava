package com.PurpleMesh.DataStructurePrograms;

<<<<<<< HEAD
import java.util.Iterator;

=======
>>>>>>> 7a66887 (second commit)
public class GenericQueue<T> {
	
	private static class Node<T>
	{
		T data;
		Node<T> next;
		
		Node(T data)
		{
			this.data = data;
			this.next=null;
		}
		
<<<<<<< HEAD
	}
=======
	} 
>>>>>>> 7a66887 (second commit)
	 
	private Node<T> frontNode;
	private Node<T> rearNode;
	private int size;
	
	 public GenericQueue() {
		 frontNode = rearNode = null;
	        size = 0;
	    }

	 
	 public void enqueue(T item)
	 {
		 Node<T> newNode = new Node<>(item);
		 
		 if(rearNode ==null)
		 {
			 frontNode = rearNode = newNode;
		 }
		 else {
			 rearNode.next=newNode;
			 rearNode=newNode;
		 }
		 size++;
	 }
	 
	 public T dequeue()
	 {
		 if(isEmpty())
		 {
			 throw new IllegalStateException("Queue is empty");
		 }
		 
		 T data = frontNode.data;
		 frontNode=frontNode.next;
		 
		 if(frontNode ==null)
		 {
			 rearNode=null;
		 }
		 size--;
		 
		 return data;
		 
	 }
	 public T dequeueLast()
	 {
		 if(isEmpty())
		 {
			 throw new IllegalStateException("Queue is empty");
		 }
		 if(frontNode == rearNode)
		 {
			 
			 T data = rearNode.data;
			 frontNode = rearNode=null;
			 size--;
			 return data;
		 }
		 
		 Node<T> currentNode=frontNode;
		 while(currentNode.next != rearNode)
		 {
			 currentNode=currentNode.next;
		 }
		 T data = rearNode.data;
		 rearNode=currentNode;
		 rearNode.next=null;
		 size--;
		 return data;
	 }
	 
	 public T peek()
	 {
		 if(isEmpty())
		 {
			 throw new IllegalStateException("Queue is empty");
		 }
		 
		 return frontNode.data;
	 }


	 public boolean isEmpty() {
	        return size == 0;
	    }
	 public int size() {
		 return size;
	 }
	 
	 public  void printQueue()
	 {
		 if(isEmpty())
		 {
			 throw new IllegalStateException("Queue is empty");
		 }
		 
		 System.out.println("Queue Elements");
		 Node<T> currentNode=frontNode;
		 
		 while(currentNode!=null)
		 {
			 System.out.print(currentNode.data+" ");
			 currentNode=currentNode.next;
		 }
	 }
	 
	
	
	    public String toString() {
	        if (isEmpty()) {
	            return "[]";
	        }
	        StringBuilder sb = new StringBuilder("[");
	        Node<T> currentNode = frontNode;
	        while (currentNode != null) {
	            sb.append(currentNode.data);
	            if (currentNode.next != null) {
	                sb.append(", ");
	            }
	            currentNode = currentNode.next;
	        }
	        sb.append("]");
	        return sb.toString();
	    }
	
	 
}
	 
	 
	 
	 


