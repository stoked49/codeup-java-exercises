/**
 * Created by Irby on 1/9/17.
 */
public class Die {

    public int numberOfSides;
    public int currentValue;
//    public int firstDie; // Number showing on the first die
//    public int secondDie; // Number showing on the second die

//    constructor
    public Die(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }
    public int roll() {
        // Roll the dice by setting each of the dice to be a random number
        currentValue = (int)(Math.random()*numberOfSides) + 1;
        return currentValue;
    }
}
