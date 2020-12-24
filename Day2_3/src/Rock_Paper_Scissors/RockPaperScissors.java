package Rock_Paper_Scissors;

import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User user = new User();
        Computer computer = new Computer();
        System.out.println("Lets Play Rock Paper Scissors!!!");
        System.out.println("Choose from the following format: (Integer)");
        System.out.println("Single Round (1) \t Best of Three (3) \t Best of Five(5)");
        int gameType = (sc.nextInt() / 2) + 1;
        int userScore = 0;
        int computerScore = 0;
        while (userScore != gameType  && computerScore != gameType) {

            Move userMove = user.getMove();
            Move computerMove = computer.getMove();

            int compareMoves = userMove.compareMoves(computerMove);
            switch (compareMoves) {
                case 1 -> {
                    System.out.println("Your "+userMove+" beats Computer's "+computerMove+". You won!");
                    userScore++;
                }
                case 0 -> System.out.println("Tie!");
                case -1 -> {
                    System.out.println("Computer's "+computerMove+" beats Your "+ userMove+". You lost.");
                    computerScore++;
                }
            }
            System.out.println("Current Score ==> You: "+userScore+" v/s Computer: "+computerScore);
        }
        if (userScore == gameType) {
            System.out.println("Congrats, You Won!!!");
        } else {
            System.out.println("Computer Won, Better Luck Next Time!!");
        }
    }
}
