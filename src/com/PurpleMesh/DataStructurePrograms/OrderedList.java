package com.PurpleMesh.DataStructurePrograms;

<<<<<<< HEAD
public class OrderedList<T extends Comparable<T>> {
   
	private Node<T> head;
	private int size;
	
    public void add(T data) {
    	
        Node<T> newNode = new Node<>(data);

        if (head == null || head.data.compareTo(data) > 0) {
            newNode.next = head;
            head = newNode;
            return;
        }else {

        Node<T> current = head;
        while (current.next != null && current.next.data.compareTo(data) < 0) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
=======
import java.util.*;

public class OrderedList<T extends Comparable<T>> {

    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node head;
    private int size = 0;

    public void add(T data) {
        Node newNode = new Node(data);

        if (head == null || data.compareTo(head.data) < 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null && data.compareTo(current.next.data) > 0) {
                current = current.next;
            }

            newNode.next = current.next;
            current.next = newNode;
>>>>>>> 7a66887 (second commit)
        }
        size++;
    }

    public boolean search(T data) {
<<<<<<< HEAD
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(data))
                return true;
=======
        Node current = head;
        while (current != null) {
            if (current.data.equals(data)) return true;
>>>>>>> 7a66887 (second commit)
            current = current.next;
        }
        return false;
    }

    public void remove(T data) {
        if (head == null) return;

        if (head.data.equals(data)) {
            head = head.next;
            size--;
            return;
        }

<<<<<<< HEAD
        Node<T> current = head;
=======
        Node current = head;
>>>>>>> 7a66887 (second commit)
        while (current.next != null && !current.next.data.equals(data)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
            size--;
        }
    }
<<<<<<< HEAD
    public T get(int index) {
        if (index < 0 || index >= size) 
        {
        	throw new IndexOutOfBoundsException("Index out of range");
        }
        	
        Node<T> current = head;
        int i = 0;
        while (i < index) {
            current = current.next;
            i++;
        }
        return current.data;
    }
    
    public void clear() {
        head = null;
        size = 0;
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> current = head;
=======

    public int size() {
        return size;
    }

    public T get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();

        Node current = head;
        for (int i = 0; i < index; i++) current = current.next;

        return current.data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
>>>>>>> 7a66887 (second commit)
        while (current != null) {
            sb.append(current.data).append(" ");
            current = current.next;
        }
        return sb.toString().trim();
    }
<<<<<<< HEAD
=======

	public void clear() {
		head = null;
        size = 0;
		
	}
>>>>>>> 7a66887 (second commit)
}
