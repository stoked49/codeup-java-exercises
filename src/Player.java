/**
 * Created by Irby on 1/18/17.
 */
public abstract class Player {
    protected String name;
    protected String response;


    public Player(String name) {
        this.name = name;
    }
    abstract String generateRoshambo();
}
