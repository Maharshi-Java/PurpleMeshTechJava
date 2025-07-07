package com.PurpleMesh.DataStructurePrograms;

public class Stack<T> {
    private Node<T> top;
    private int size;

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    public Stack() {
        top = null;
        size = 0;
    }

    public void push(T data) {
        Node<T> node = new Node<>(data);
        node.next = top;
        top = node;
        size++;
    }

    public T pop() {
        if (isEmpty()) return null;
        T data = top.data;
        top = top.next;
        size--;
        return data;
    }

    public T peek() {
        return isEmpty() ? null : top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }
}
