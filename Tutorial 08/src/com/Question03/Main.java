package com.Question03;

public class Main {
    public static void main(String[] args) {
        Patient patient1 = new Patient("P001", "Alice Smith", 30, "Female", "0712345678");
        Appointment appointment1 = new Appointment("A001", patient1, "Dr. Brown", "2025-06-10", "09:30", "General Check-up");

        System.out.println(patient1);
        System.out.println();
        System.out.println(appointment1);
    }
}
