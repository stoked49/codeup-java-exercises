/**
 * Created by Irby on 1/10/17.
 */
//    1. ToDo Write a program that will recognize invalid inputs when the user sets information about student
//            - Write a student class with firstName, lastName, age (Student.java)
//            - The Main class should be called ExceptionDemo.java
//
//            - Prompt the user to ask about a particular student (first, last, age)
//            - Give proper responses according to user-submitted information
//
//            - If data is invalid, then use exception handling the re-prompt the user for valid data
//
//            - Try to catch as many exceptions as possible
//
//            - Make the app as user friendly as possible
//
//
//    2. ToDo Create a validator class and a ValidatorTestApp (w/ main method) to test
//
//            Create a class called Validator with the following methods
//            public Validator(Scanner sc)
//            public int getInt(String prompt)
//            public int getIntWithinRange(String prompt, int min, int max)
//            public double getDouble(String prompt)
//            public double getDoubleWithinRange(String, prompt, double min, double max)
//
//            public String getRequiredString(String prompt)
//            make sure it aint empty or just spaces
//
//
//    3. ToDo     Build the high-low game
//            - use your Validator class in the main() method of HiLow Game to get inputs
//
//    4. ToDo     Build the ping-pong game
//            - use the Validator class in the main() method  of Ping-Pong to get inputs
//              bonus - try to make this as object oriented as possible

import java.util.Scanner;
import java.util.InputMismatchException;

public class ValidatorTestApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Validator validator = new Validator(sc);

        System.out.println("Welcome to the Validator Test App");
        System.out.println("Int Test");

        int userInt = validator.getInt("Enter an integer: ", sc);
        System.out.println("You entered " + userInt);

        double userDouble = validator.getDouble("Enter any double: ", sc);
        System.out.println("You entered " + userDouble);

        int rangedUserInt = validator.getIntWithinRange("Enter any Integer within -100 and 100: ", -100, 100);
        System.out.println("You entered " + rangedUserInt);

        double rangedUserDouble = validator.getDoubleWithinRange("Enter any double between -100 and 100: ", -100, 100);
        System.out.println("You entered " + rangedUserDouble);

        String userString = validator.getRequiredString("Please input a string ", sc);
        System.out.println("You entered " + userString);
    }


}
