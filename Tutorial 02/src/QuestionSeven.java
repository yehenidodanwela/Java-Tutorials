import java.util.Scanner;

public class QuestionSeven {
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your account balance: ");
        double accountBalance = input.nextDouble();

        while (true){
            System.out.println("Choose a transaction: ");
            System.out.println("No 1 - Deposit");
            System.out.println("No 2 - Withdrawal");
            System.out.println("No 3 - Check for Fraud");
            System.out.println("No 4 - Exit");
            int transactionChoice = input.nextInt();

            if (transactionChoice == 1){
                System.out.print("Enter Deposit amount: ");
                double depositAmount = input.nextDouble();
                if (depositAmount > 0){
                    accountBalance += depositAmount;
                    System.out.println("Deposit successful. New account balance is: " + accountBalance);
                }
                else{
                    System.out.println("Enter a valid amount");
                }
            }
            else if (transactionChoice == 2){
                System.out.print("Enter Withdrawal amount: ");
                double withdrawalAmount = input.nextDouble();

                if (withdrawalAmount > 0){
                    if(withdrawalAmount < accountBalance ){
                        accountBalance -= withdrawalAmount;
                        System.out.println("Withdrawal successful. New account balance is: " + accountBalance);
                    }
                    else{
                        System.out.println("Warning: Overdraft! Your balance will go negative");
                    }
                }
                else{
                    System.out.println("Enter a valid amount");
                }
            }
            else if (transactionChoice == 3){

                double thresholdAmount = 100;
                if (accountBalance < thresholdAmount){
                    System.out.println("Warning: Low balance detected! Your balance is below $100");
                }
                else{
                    System.out.println("No issues detected. Account balance is above the fraud threshold");
                }

            }
            else if (transactionChoice == 4){
                System.out.println("Exiting the banking system. Thank you!");
                break;
            }
            else{
                System.out.println("Please select a valid transaction");
            }
        }
    }
}
