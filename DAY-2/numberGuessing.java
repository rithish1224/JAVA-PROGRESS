import java.util.Random;
import java.util.Scanner;

public class numberGuessing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        int guess;
        int attempts=0;
        int randomNumber  = random.nextInt(1,11);

        System.out.println("Welcome to Number guessing game");
        System.out.println("Guess a Number Between 1 to 10");

        do{
            System.out.println("Enter a guess:");
            guess = sc.nextInt();
            attempts ++;

            if(guess<randomNumber){
                System.out.println("Too low!!!");
            }

            else if(guess>randomNumber){
                System.out.println("Too high!!!");
            }
            else{
                System.out.println("You Have won");
                System.out.println("No of Attempts"+" "+attempts);
            }
        }while(guess != randomNumber);
        System.out.print("You have won");
    }

}
