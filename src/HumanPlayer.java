import validation.Validator;

import java.util.Scanner;

/**
 * Created by Irby on 1/18/17.
 */
public class HumanPlayer extends Player {
    public HumanPlayer(String name) {
        super(name);

    }

     @Override
     String generateRoshambo() {
//        runLoop condition check
        boolean runLoop = true;
        Scanner sc = new Scanner(System.in);
        Validator validate = new Validator(sc);
        String player1HandSays = null;
        while (runLoop) {
            player1HandSays = validate.getRequiredString("Genius, it's time to go.....ROCK, PAPER, SCISSORS....SHOOT!! ");
            if (player1HandSays.equalsIgnoreCase("rock") || player1HandSays.equalsIgnoreCase("paper") || player1HandSays.equalsIgnoreCase("scissors")) {
                response = player1HandSays;
                runLoop = false;
            } else {
                System.out.println("Please enter a valid response, such as: Rock, Paper, or Scissors. ");
            }
        }
        return player1HandSays;
    }
}
