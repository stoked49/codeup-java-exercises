import java.util.Scanner;

/**
 * Created by Irby on 1/8/17.
 */
public class DiceRollingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfSides;
        String userResponse;


//        Prompt User for number of sides per pair of dice
        System.out.println("How many sides does a pair of dice have? ");
        numberOfSides = sc.nextInt();

//        Prompt User to roll the dice
//        System.out.println("Would you like to roll the dice? ");
//        userResponse = sc.nextLine();
//        while (userResponse.equalsIgnoreCase("yes
// ")
        Die firstDie = new Die(numberOfSides);
        firstDie.roll();

        Die secondDie = new Die(numberOfSides);
        secondDie.roll();

        System.out.println("You rolled a " + firstDie.currentValue + " and a " + secondDie.currentValue + ".");
        System.out.println("This is a total of " + (firstDie.currentValue + secondDie.currentValue));
    }
}
