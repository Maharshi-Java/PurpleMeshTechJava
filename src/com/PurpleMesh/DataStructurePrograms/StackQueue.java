package com.PurpleMesh.DataStructurePrograms;

public class StackQueue<T> {

    private GenericStack<T> stack1 = new GenericStack<>();
    private GenericStack<T> stack2 = new GenericStack<>();

    public void enqueue(T item) {
        stack1.push(item);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}
