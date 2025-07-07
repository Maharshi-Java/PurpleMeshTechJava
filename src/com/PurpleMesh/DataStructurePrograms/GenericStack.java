package com.PurpleMesh.DataStructurePrograms;

public class GenericStack<T> {
<<<<<<< HEAD
	
	private static class Node<T>{
		T dataT;
		Node<T> nextNode;
		public Node(T data) {
			this.dataT=data;
			
		}
		
		private Node<T> topNode;
		
		public void push(T item)
		{
			Node<T> node=new Node<>(item);
			node.nextNode=topNode;
			topNode=node;
		}
		
		public T pop()
		{
			if(isEmpty())
			{
				throw new IllegalStateException("Stack is empty");
			}
			T itemT =topNode.dataT;
			topNode =topNode.nextNode;
			return itemT;
		}
	
		public T peek() {
	        if (isEmpty()) {
	            throw new IllegalStateException("Stack is empty");
	        }
	        return topNode.dataT;
	    }
		
		public boolean isEmpty() {
	        return topNode == null;
	    }
	}

=======

    private static class Node<T> {
        T dataT;
        Node<T> nextNode;

        public Node(T data) {
            this.dataT = data;
            this.nextNode = null;
        }
    }

    private Node<T> topNode;

    public void push(T item) {
        Node<T> node = new Node<>(item);
        node.nextNode = topNode;
        topNode = node;
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T item = topNode.dataT;
        topNode = topNode.nextNode;
        return item;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return topNode.dataT;
    }

    public boolean isEmpty() {
        return topNode == null;
    }
>>>>>>> 7a66887 (second commit)
}
