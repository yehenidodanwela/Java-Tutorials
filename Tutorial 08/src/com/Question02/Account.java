package com.Question02;

public class Account {
    private String holderName;
    private String accountNumber;
    private String accountType;
    private double accountBalance;

    public Account(String holderName, String accountNumber, String accountType, double accountBalance) {
        this.holderName = holderName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;

        if (accountBalance >= 0) {
            this.accountBalance = accountBalance;
        } else {
            System.out.println("Initial balance can't be negative. Setting to 0.");
            this.accountBalance = 0;
        }
    }
        public void depositMoney(double amount){
            if (amount > 0) {
                accountBalance += amount;
                System.out.println("Amount deposited successfully.");
            }
            else {
                System.out.println("Deposit amount must be positive.");
            }
        }
        public void withdrawMoney(double amount) {
            if (amount <= 0) {
                System.out.println("Withdrawal amount must be positive.");
            }
            else if (amount > accountBalance) {
                System.out.println("Insufficient balance.");
            }
            else {
                accountBalance -= amount;
                System.out.println("Amount withdrawn successfully.");
            }
        }
        public void displayAccountDetails() {
            System.out.println("Account Holder: " + holderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Type: " + accountType);
        }
        public double checkBalance() {
            return accountBalance;
        }
    }

