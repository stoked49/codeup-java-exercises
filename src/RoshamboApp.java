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
        String player1GoPck

//      Greet the end-user
        System.out.println("You ready to get rocked, smothered, or cut?  Roshambo bitches... ");


        do {
//          Prompt Player for name
            playerName = validate.getRequiredString("Stop taking forever and enter your name!\n");

//          Prompt Player for Opponent selection
            opponentChoice = validate.getRequiredString("Rocko and Stitchez have indicated they want to eat your children. I've convinced them to settle for a game of Roshambo instead. \n Pick One \n");

//          Prompt player to choose between rock, paper and scissors (use validator)


//          Create an enum called Roshambo that stores the 3 values



            sc.nextLine();
            proceed = validate.getRequiredString("Another game? \n");
        } while (proceed.equalsIgnoreCase("y"));    }


}
