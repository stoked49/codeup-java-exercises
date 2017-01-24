/**
 * Created by Irby on 1/17/17.
 */
import validation.Validator;

import java.util.*;

public class CircleApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Validator validator = new Validator(sc);
        String proceed;
        double radius;


        System.out.println("Welcome to the Circle Calculator App");
        do {
            //        Prompt the user for the radius of the circle
            radius = validator.getDouble("Please enter the radius of the circle: ");
            Circle circle = new Circle(radius);


//        Calculate the area of the circle (round to 2 decimal places)
            System.out.println("The area of the circle is " + circle.getFormattedArea());

//        Calculate the circumference of the circle (round to 2 decimal places)
            System.out.println("The circumference of the circle is " + circle.getFormattedCircumference());

//        Prompt the user to continue (if No, say "Goodbye" and the number of circles built)
            sc.nextLine();
            proceed = validator.getRequiredString("Another Circle? ");
        } while (proceed.equalsIgnoreCase("y"));

        System.out.println("Goodbye.  You calculated the data of " + Circle.circlesCreated + " circles. ");
    }
}
