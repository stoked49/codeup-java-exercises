/**
 * Created by Irby on 1/5/17.
 */

import java.util.Scanner;

public class FactorialTest {
    public static void main(String[] args) {
        int getFactorial = factorial(5);
        System.out.println(getFactorial);
    }
    public static int factorial (int input)
    {
        int x, fact = 1;
        for ( x = input; x > 1; x--)
            fact *= x;
        return fact;

    }
}
