import java.util.Scanner;

public class quiz_game {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] questions = {"What is the Largest continent in the world?",
                              "Which part of the computer is considered as brain?"};

        String[][] options = {{"1. Asia","2. Australia","3. Antartica","4.America"},
                              {"1. cpu","2.Hard drive","3.Mouse","4. keyboard"}};

        int[] answers = {1,1};
        int score= 0;
        int guess;

        System.out.println("*********************");
        System.out.println("Welcome to Quiz game");
        System.out.println("*********************");

        for(int i=0;i <questions.length;i++){
            System.out.println(questions[i]);
            for(String option : options[i]){
                System.out.println(option);
            }
            System.out.println("Enter the guess");
            guess = sc.nextInt();

            if(guess == answers[i]){
                System.out.println("CORRECT!");
                score++;
            }
            else{
                System.out.println("WRONG!");
            }
        }

        System.out.println("Your final score is: "+score+ " Out of "+questions.length);

    }


}
