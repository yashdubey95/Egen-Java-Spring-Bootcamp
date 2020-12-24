package Rock_Paper_Scissors;

import java.util.Scanner;

public class User {

    private Scanner scan;

    public User() {
        scan = new Scanner(System.in);
    }

    public Move getMove() {
        System.out.print("Rock (R) | Paper (P) | Scissors (S) ?");
        String userMove = scan.nextLine();
        return switch (userMove.toUpperCase()) {
            case "R" -> Move.ROCK;
            case "P" -> Move.PAPER;
            case "S" -> Move.SCISSORS;
            default -> getMove();
        };

    }

}
