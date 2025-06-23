package com.Tutorial10.QuestionTwo;

public class QuestionTwoMain {
    public static void main(String[] args) {
        // Create FIFO queue for Person objects
        PersonFIFO queue = new PersonFIFO(5);

        // Create Person objects
        Person p1 = new Person("Alex", "Smith");
        Person p2 = new Person("Tony", "Brown");
        Person p3 = new Person("Charlie", "Johnson");

        // Enqueue Person objects
        queue.enqueue(p1);
        queue.enqueue(p2);
        queue.enqueue(p3);

        // Print the queue
        queue.print();

        // Dequeue one and print details
        Person removedPerson = queue.dequeue();
        System.out.print("Dequeued person: ");
        removedPerson.print();  // prints: Name: Alex, Surname: Smith

        // Print queue again
        queue.print();
    }
}
