import validation.Validator;

import java.util.Scanner;

/**
 * Created by Irby on 1/18/17.
 */


public class RoshamboApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Validator validate = new Validator(sc);
        String proceed;
        String playerName;
        String opponentChoice;
        String player1HandSays;
        String cpuPlayerHandSays;
        Player cpuPlayer;

//      Greet the end-user
        System.out.println("                                                          \n" +
                " _____              _                        _            \n" +
                "(_____)       ____ (_)                      (_)           \n" +
                "(_)__(_) ___ (____)(_)__    ____   __   __  (_)_     ___  \n" +
                "(_____) (___)(_)__ (____)  (____) (__)_(__) (___)_  (___) \n" +
                "( ) ( )(_)_(_)_(__)(_) (_)( )_( )(_) (_) (_)(_)_(_)(_)_(_)\n" +
                "(_)  (_)(___)(____)(_) (_) (__)_)(_) (_) (_)(____)  (___) \n" +
                "                                                          \n" +
                "                                                          ");
        System.out.println("You ready to get rocked, smothered, or cut?  Roshambo bitches... ");


        do {
//          Prompt Player for name
            playerName = validate.getRequiredString("Stop taking forever and enter your name!\n");
            Player human = new HumanPlayer(playerName);
            // call the getRoshambo method for the human object (prompt the user)

//          Prompt Player for Opponent selection
            opponentChoice = validate.getRequiredString("Rocko and Stitchez have indicated they want to eat your children. I've convinced them to settle for a game of Roshambo instead. \n Pick One \n");
            System.out.println(opponentChoice + " Guarantees victory");

            // if they pick Rocko, make a Rock object
            if (opponentChoice.equalsIgnoreCase("Rocko")) {
                cpuPlayer = new Rocko("Rocko");
            // Else make stitchez
            } else {
                cpuPlayer = new Stitchez("Stitchez");
            }
//          Prompt player to choose between rock, paper and scissors (use validator)
            player1HandSays = human.generateRoshambo();

            // run the getRoshambo for whichever computer object
            cpuPlayerHandSays = cpuPlayer.generateRoshambo();

            // compare the values



            sc.nextLine();
            proceed = validate.getRequiredString("Another game? \n");
        } while (proceed.equalsIgnoreCase("y"));
    }
    public String determineWinner (String player1HandSays, String cpuPlayerHandSays) {
        String result = "";
        String lossMessage = "You have lost this round. ";
        String drawMessage = "This round is a draw";
        String winMessage = "You have won this round. ";
        if (player1HandSays.equalsIgnoreCase(cpuPlayerHandSays)) {
            result = drawMessage;

        } else if (player1HandSays.equalsIgnoreCase("rock")) {
            if (cpuPlayerHandSays.equalsIgnoreCase("paper")) {
                result = lossMessage;
            }
        } else if (player1HandSays.equalsIgnoreCase("rock")) {
            if (cpuPlayerHandSays.equalsIgnoreCase("scissors")) {
                result = winMessage;
            }
        } else if (player1HandSays.equalsIgnoreCase("paper")) {
            if (cpuPlayerHandSays.equalsIgnoreCase("rock")) {
                result = winMessage;
            }
        } else if (player1HandSays.equalsIgnoreCase("paper")) {
            if (cpuPlayerHandSays.equalsIgnoreCase("scissors")) {
                result = lossMessage;
            }
        } else if (player1HandSays.equalsIgnoreCase("scissors")) {
            if (cpuPlayerHandSays.equalsIgnoreCase("rock")) {
                result = lossMessage;
            }
        } else if (player1HandSays.equalsIgnoreCase("scissors")) {
            if (cpuPlayerHandSays.equalsIgnoreCase("paper")) {
                result = winMessage;
            }

        }

        return result;
    }
}
