package com.Tutorial10.QuestionThree;

public class QuestionThreeMain {
        public static void main(String[] args) {
            // Step 3: Create LIFO stack with capacity 10
            LIFO browserHistory = new LIFO(10);

            // Step 4–7: Push websites (simulate visiting)
            browserHistory.push("www.google.com");
            browserHistory.push("www.github.com");
            browserHistory.push("www.w3schools.com");
            browserHistory.push("www.hackerrank.com");

            // Step 8: Get current website
            String current = browserHistory.getCurrent();
            System.out.println("Current website: " + current); // Expected: hackerrank

            // Step 9: Print browser history
            browserHistory.print();

            // Step 10: Simulate going back twice
            System.out.println("Going back...");
            System.out.println("Left: " + browserHistory.pop()); // hackerrank
            System.out.println("Left: " + browserHistory.pop()); // w3schools

            // Show updated history
            browserHistory.print();
        }
}
