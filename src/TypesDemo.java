/**
 * Created by Irby on 1/3/17.
 */
public class TypesDemo {
    // create variables of every primitive type and print them to the console
    // try to assign a character to a variable that has been declared as an int
    // try to define a variable with the name class
    // initialize a variable, but do not assign it a value, then try and print it to the console
    public static void main(String[] args) {
        byte myByte = 127;
        short myShort = 32767;
        int myInteger = 2147483647;
        double myDouble = 1234567890;
        long myLong = 9223372036854775807L;
        float myFloat = 3.14159F;
        char myChar = 'I';
        boolean myBoolean = true;

        long maxLong = Long.MAX_VALUE;
        long maxLongPlusOne = maxLong + 1;
        long maxLongPlusTwo = maxLong + 2;

        System.out.println("The largest long value is " + maxLong);
        System.out.println("The largest long value plus one is " + maxLongPlusOne);
        System.out.println("The largest long value plus two is " + maxLongPlusTwo);
        System.out.println(myBoolean);
    }
}