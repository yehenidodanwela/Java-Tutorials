package com.Tutorial10.QuestionOne;

public class QuestionOneMain {
    public static void main(String[] args) {

        FIFO queue = new FIFO(10);

        queue.enqueue("Alex");
        queue.enqueue("Tony");
        queue.enqueue("Charlie");

        queue.print();

        String removedItem = queue.dequeue();
        System.out.println("Dequeued: " + removedItem);

        queue.print();

        queue.dequeue();
        queue.dequeue();

        // Try to dequeue when queue is empty
        String item = queue.dequeue(); // Should print warning and return null
        System.out.println("Tried to dequeue from empty queue: " + item);
    }
}
