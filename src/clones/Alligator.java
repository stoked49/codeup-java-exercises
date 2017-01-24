package clones;

/**
 * Created by Irby on 1/23/17.
 */
public class Alligator implements Countable {
    private int count = 0;

    @Override
    public void incrementCount() {count++;}

    @Override
    public void resetCount() {count = 0;}


}
