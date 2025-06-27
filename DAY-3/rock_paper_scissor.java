import java.util.Scanner;
import java.util.Random;

public class rock_paper_scissor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String[] choice = {"rock" , "paper" ,"scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do{System.out.print("Enter your move: ");
            playerChoice = sc.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
                System.out.println("Invalid choice");
                continue;
            }

            computerChoice = choice[random.nextInt(3)];
            System.out.println("Computer choice: " + computerChoice);

            if(playerChoice.equals(computerChoice)){
                System.out.println("Its a Tie");
            }
            else if(playerChoice.equals("rock") && computerChoice.equals("scissors")){
                System.out.println("You win!");
            }
            else if(playerChoice.equals("scissors") && computerChoice.equals("paper")){
                System.out.println("You win!");
            }
            else if(playerChoice.equals("paper") && computerChoice.equals("rock")){
                System.out.println("You win!");
            }
            else{
                System.out.println("You Lose!");
            }

            System.out.println("Play again(YES/NO)");
            playAgain = sc.nextLine().toLowerCase();}
        while(playAgain.equals("yes"));

    }
}
