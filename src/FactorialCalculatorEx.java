/**
 * Created by Irby on 1/5/17.
 */
import java.util.Scanner;

public class FactorialCalculatorEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int factor = 1;

        System.out.println("Please enter an integer from 1-10");
        int userNumber = sc.nextInt();
        int getFactorial = factorial(userNumber);
        System.out.println(getFactorial);
        System.out.println("Would you like to continue? ");
    }
    public static int factorial(int userNumber) {
        if (userNumber == 0) {
            return 1;
        } else {
            System.out.println(userNumber + "*" + (userNumber-1));
            return userNumber * factorial(userNumber - 1);
        }
    }
}


