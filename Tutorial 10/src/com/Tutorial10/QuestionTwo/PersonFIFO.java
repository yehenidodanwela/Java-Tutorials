package com.Tutorial10.QuestionTwo;

public class PersonFIFO {
    private Person[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public PersonFIFO(int capacity) {
        this.capacity = capacity;
        this.queue = new Person[capacity];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }

    public boolean enqueue(Person person) {
        if (size == capacity) {
            System.out.println("Queue is full. Cannot enqueue.");
            return false;
        }
        queue[rear] = person;
        rear = (rear + 1) % capacity;
        size++;
        return true;
    }

    public Person dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return null;
        }
        Person person = queue[front];
        front = (front + 1) % capacity;
        size--;
        return person;
    }

    public void print() {
        System.out.println("People in queue:");
        for (int i = 0; i < size; i++) {
            Person p = queue[(front + i) % capacity];
            System.out.println("- " + p);
        }
    }
}
