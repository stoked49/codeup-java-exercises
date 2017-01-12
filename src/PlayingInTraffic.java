/**
 * Created by Irby on 1/12/17.
 */
import java.util.Random;



public class PlayingInTraffic {
    public static void main(String[] args) {

        String [] colors = {"RED", "YELLOW", "GREEN"};
        Random random = new Random();

        // randomly selects an index from the colors
        int select = random.nextInt(colors.length);

        // prints out the value at the randomly selected color
        System.out.println("The traffic light is displaying: " + colors[select]);

        TrafficLightColor color = TrafficLightColor.valueOf(colors[select]);
             makeDrivingDecision(color);
    }
    private static void makeDrivingDecision(TrafficLightColor color) {
        switch(color) {
            case RED:
                System.out.println("RED LIGHT!  HALT! ");
                break;
            case YELLOW:
                System.out.println("Yellow Light. Proceed with caution or prepare to stop. ");
                break;
            case GREEN:
                System.out.println("green light. Let's play a game called **Mash the pedal** ");
                break;
            default:
                System.out.println("Hopefully everyone follows all of the traffic devices! ");
        }
    }

}
