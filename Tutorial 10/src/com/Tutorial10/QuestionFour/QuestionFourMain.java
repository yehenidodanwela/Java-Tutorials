package com.Tutorial10.QuestionFour;

import java.util.Scanner;

public class QuestionFourMain {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nInventory Management System");
            System.out.println("1. Add Tomato Box");
            System.out.println("2. Add Carrot Box");
            System.out.println("3. Sell Tomato Box");
            System.out.println("4. Sell Carrot Box");
            System.out.println("5. Print Inventory");
            System.out.println("6. Exit");
            System.out.print("Choose an option (1-6): ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter best before date for tomato box: ");
                    String tomatoDate = scanner.nextLine();
                    inventory.addTomatoBox(tomatoDate);
                    break;
                case 2:
                    System.out.print("Enter best before date for carrot box: ");
                    String carrotDate = scanner.nextLine();
                    inventory.addCarrotBox(carrotDate);
                    break;
                case 3:
                    inventory.sellTomatoBox();
                    break;
                case 4:
                    inventory.sellCarrotBox();
                    break;
                case 5:
                    inventory.printInventory();
                    break;
                case 6:
                    System.out.println("Exiting system. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
