import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Irby on 1/9/17.
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
//            Create a class called validation.Validator with the following methods
//            public validation.Validator(Scanner sc)
//            public int getInt(String prompt)
//            public int getIntWithinRange(String prompt, int min, int max)
//            public double getDouble(String prompt)
//            public double getDoubleWithinRange(String, prompt, double min, double max)
//
//            public String getRequiredString(String prompt)
//            public String getChoiceString(String prompt, String s1, String s2)
//
//
//    3. ToDo     Build the high-low game
//
//    4. ToDo     Build the ping-pong game
//              bonus - try to make this as object oriented as possible


import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Welcome to the CodeUp Student Search");
        System.out.println("Please input a new student");

        String firstName = getString("First Name: ");
        String lastName = getString("Last Name: ");
        int age = getInt("Age? ");
    }

    private static int getInt(String prompt) {
        Scanner scan = new Scanner(System.in);
        int userInteger;

        System.out.print(prompt);
        try {
            userInteger = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Your input must be an integer, nothing else!");
            return getInt(prompt);
        }
        return userInteger;
    }

    public static String getString(String prompt) {
        Scanner scan = new Scanner(System.in);
        String inputString;

        System.out.println(prompt);
        try {
            inputString = scan.nextLine();

        } catch (Exception e) {
            System.out.println("Whoops, something went wrong");
            return getString(prompt);
        }
        return inputString;
    }
}
