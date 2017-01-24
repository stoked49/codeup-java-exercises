/**
 * Created by Irby on 1/18/17.
 */
import java.util.Random;

public class Stitchez extends Player {
    public Stitchez(String name) {
        super(name);

    }
@Override
    public String generateRoshambo() {
        Random random = new Random();
        int choice = random.nextInt(3);
        if (choice == 0) {
            return "rock";
        } else if (choice == 1){
            return "paper";
        } else {
            return "scissors";
        }
    }

}

