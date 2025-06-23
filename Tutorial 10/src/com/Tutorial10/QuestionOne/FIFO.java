package com.Tutorial10.QuestionOne;

public class FIFO {
    private String[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public FIFO(int capacity) {
        this.capacity = capacity;
        this.queue = new String[capacity];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }

    public boolean enqueue(String item) {
        if (size == capacity) {
            System.out.println("Queue is full. Cannot enqueue.");
            return false;
        }
        queue[rear] = item;
        rear = (rear + 1) % capacity;
        size++;
        return true;
    }

    public String dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return null;
        }
        String item = queue[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    public void print() {
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
