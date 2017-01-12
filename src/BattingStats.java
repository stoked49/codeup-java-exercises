import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by Irby on 1/11/17.
 */

public class BattingStats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//      Declare Variables
        int totalAtBats;
        int[] basesEarnedArray;
        double sluggingPercentage;
        int totalHits;

//      Prompt User for at bats
        System.out.println("Hello, and welcome to the Batting Stats calculator");
        System.out.println("Can you tell me how many times the batter has been up to bat for the game in question? ");
        totalAtBats = sc.nextInt();
        basesEarnedArray = new int[totalAtBats];

//      Since the Array of each at bat is created, we can prompt the user for each at bat result and update the array by iterating
        for (int i = 0; i < basesEarnedArray.length; i++) {
            System.out.println("Enter bases earned for each at bat please. " + "Result for at bat #" + (i+1) + "? : ");
            basesEarnedArray[i] = sc.nextInt();
        }

//      Iterate through the array and tally up all non-zero values to calculate total hits
        totalHits = 0;
        for (int i = 0; i < basesEarnedArray.length; i ++) {
            if (basesEarnedArray[i] != 0)
                totalHits++;
        }

//      Calculate player's batting average
        double battingAvg;
        battingAvg = ((double)totalHits)/totalAtBats;
//      Limit battingAvg to 3 decimal places and output the value
        DecimalFormat numberFormat = new DecimalFormat("#.000");
        System.out.println("The player's batting average for the game is  " + numberFormat.format(battingAvg));

//      Calculate player's slugging percentage
        int earnedBases = IntStream.of(basesEarnedArray).sum();
        sluggingPercentage = ((double)earnedBases)/totalAtBats;
        System.out.println("The player's slugging percentage for the game is " + sluggingPercentage);
    }
}
