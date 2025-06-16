import java.util.Scanner;

public class BankingProgram {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        double balance=0;
        int choice;
        boolean isRunning = true;


        while(isRunning){
            System.out.println("**********");
            System.out.println("Banking Program");
            System.out.println("**********");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("**********");

            System.out.println("Enter your choice (1-4)");
            choice = sc.nextInt();

            switch(choice){
                case 1 -> checkBalance(balance);
                case 2 -> balance = balance + deposit();
                case 3 -> balance = balance - withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Not a valid input");
            }
    }
}
    static void checkBalance(double balance){
        System.out.printf("$%f\n",balance);
    }

    static double deposit(){
        double amount;
        System.out.println("Enter the amount to be Deposited");
        amount = sc.nextDouble();
        if(amount<0){
            System.out.println("Amount cant be negative");
            return 0;
        }
        else{
            return amount;
        }
    }

    static double withdraw(double balance){
        double amount;
        System.out.println("Enter the amount to be Withdrawed");
        amount = sc.nextDouble();
        if(amount>balance){
            System.out.println("Insufficient Balance");
            return 0;
        }
        else{
            return amount;
        }
    }
}
