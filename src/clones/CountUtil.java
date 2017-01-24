package clones;

/**
 * Created by Irby on 1/23/17.
 */
public class CountUtil {
    public static void count(Countable c, int maxCount) {
        for (int i = 0; i < maxCount; i++) {
            c.incrememtCount();
            System.out.println(c.getCountString());
        }
        c.resetCount();
    }
}
