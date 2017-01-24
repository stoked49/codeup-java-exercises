package validation; /**
 * Created by Irby on 1/10/17.
 */

import com.sun.tools.doclets.internal.toolkit.util.DocFinder;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Validator {
    Scanner sc = new Scanner(System.in);

    public Validator(Scanner sc) {
        this.sc = sc;
    }



    public int getInt(String prompt) {
        int userInteger;
        System.out.println(prompt);
        try {
            userInteger = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error! Invalid integer value. Try again");
            // Keeps the scanner from "skipping" the next input
            sc.next();
            return getInt(prompt);
        }
        return userInteger;
    }


    public int getIntWithinRange(String prompt, int min, int max){
        int userInteger;
        System.out.println(prompt);
        try {
            userInteger = sc.nextInt();
            if (userInteger < min || userInteger > max ) {
                throw new InputMismatchException("Error! Numerical value is not within " + min + "and " + max);
            }
        } catch (InputMismatchException e) {
            System.out.println("Error! Invalid integer value.  Try again");
            // Keeps the scanner from "skipping" the next input
            sc.next();
            return getIntWithinRange(prompt, min, max);
        }
        return userInteger;
    }


    public double getDouble(String prompt) {
        double userDouble;
        System.out.print(prompt);
        try {
            userDouble = sc.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Error! Invalid decimal value. Try again. ");
            sc.next();
            return getDouble(prompt);
        }
        return userDouble;
    }


    public double getDoubleWithinRange(String prompt, double min, double max) {
        double userDouble;
        System.out.println(prompt);
        try {
            userDouble= sc.nextDouble();
            if (userDouble < min || userDouble > max) {
                throw new InputMismatchException("Error! Numberical value is not within " + min + "and " + max);
            }
        } catch (InputMismatchException e) {
            System.out.println("Error! Invalid decimal value.  Try again. ");
            sc.next();
            return getDoubleWithinRange(prompt, min, max);
        }
    return userDouble;
    }


    public String getRequiredString(String prompt) {
        String inputString;

        System.out.print(prompt);
        try {
            inputString = sc.nextLine();

        } catch(Exception e) {
            System.out.println("Whoops, something went wrong...");

            // Keeps the scanner from "skipping" the next input
            sc.next();
            return getRequiredString(prompt);
        }

        return inputString;
    }
}
