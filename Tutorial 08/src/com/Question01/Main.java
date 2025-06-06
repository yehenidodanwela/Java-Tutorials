package com.Question01;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Alex", "w12345");
        System.out.println(s1.getName());
        s1.setName("Bob");
        System.out.println(s1.getName());
        System.out.println(s1.getID());

        Module s1m1 = new Module("CS101", 45, 55); // Pass
        Module s1m2 = new Module("CS102", 30, 35); // Fail
        Module s1m3 = new Module("CS103", 60, 70); // Pass

        s1.addModule(s1m1);
        s1.addModule(s1m2);
        s1.addModule(s1m3);

        // Create Student 2
        Student s2 = new Student("Sara", "w67890");

        Module s2m1 = new Module("CS201", 50, 60); // Pass
        Module s2m2 = new Module("CS202", 20, 25); // Fail

        s2.addModule(s2m1);
        s2.addModule(s2m2);

        // Print results
        System.out.println("Results for " + s1.getName() + ":");
        s1.showPass();

        System.out.println("\nResults for " + s2.getName() + ":");
        s2.showPass();

    }
}
