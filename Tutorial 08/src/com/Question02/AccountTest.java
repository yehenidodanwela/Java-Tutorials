package com.Question02;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Account Holder's Name:");
        String name = input.nextLine();

        System.out.println("Enter Account Number:");
        String accountNumber = input.nextLine();

        System.out.println("Enter Initial Balance:");
        double balance = input.nextDouble();
        input.nextLine();

        System.out.println("Enter Account Type:");
        String type = input.nextLine();

        System.out.println("Creating " + name + "'s Account");
        Account account = new Account(name, accountNumber, type, balance);
        System.out.println("Account Created\n");

        int choice;
        do {
            System.out.println("\nTo Withdraw Money        : Press 1");
            System.out.println("To Deposit Money         : Press 2");
            System.out.println("To Check Balance         : Press 3");
            System.out.println("To View Account Details  : Press 4");
            System.out.println("To Exit                  : Press 5");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the Amount you want to withdraw: ");
                    double withdrawAmount = input.nextDouble();
                    account.withdrawMoney(withdrawAmount);
                    break;
                case 2:
                    System.out.print("Enter the Amount you want to deposit: ");
                    double depositAmount = input.nextDouble();
                    account.depositMoney(depositAmount);
                    break;
                case 3:
                    System.out.println("Current Account Balance is: " + account.checkBalance());
                    break;
                case 4:
                    account.displayAccountDetails();
                    break;
                case 5:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);

        input.close();
    }
}
