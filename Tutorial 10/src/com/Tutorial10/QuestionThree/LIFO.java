package com.Tutorial10.QuestionThree;

public class LIFO {
    private String[] stack;
    private int top;
    private int capacity;

    public LIFO(int capacity) {
        this.capacity = capacity;
        this.stack = new String[capacity];
        this.top = -1; // empty stack
    }

    public boolean push(String website) {
        if (top == capacity - 1) {
            System.out.println("Stack is full. Cannot push.");
            return false;
        }
        stack[++top] = website;
        return true;
    }

    public String pop() {
        if (top == -1) {
            System.out.println("Stack is empty. Cannot pop.");
            return null;
        }
        return stack[top--];
    }

    // Step 2: getCurrent() method
    public String getCurrent() {
        if (top == -1) {
            System.out.println("Stack is empty. No current website.");
            return null;
        }
        return stack[top];
    }

    public void print() {
        if (top == -1) {
            System.out.println("History is empty.");
            return;
        }

        System.out.println("Browser History:");
        for (int i = top; i >= 0; i--) {
            System.out.println("- " + stack[i]);
        }
    }
}
