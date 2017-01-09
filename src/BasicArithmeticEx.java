/**
 * Created by Irby on 1/5/17.
 */
import java.util.Scanner;

public class BasicArithmeticEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        int y;

//        String arithmeticMethod;
//        int sum;
//        int difference;
//        int product;
//        double quotient;
//
//
//        System.out.println("Choose arithmetic method.  Type 'a', 's', 'm', or 'd' to add, subtract, multiply, or divide (lowercase without quotes)");
//        arithmeticMethod = sc.nextLine();

        System.out.println("Please enter the first operand: ");
        x = sc.nextInt();
        System.out.println("Please enter the second operand: ");
        y = sc.nextInt();
        int getSum = addNumbers(x, y);
        System.out.println(getSum);

        int getDifference = subNumbers(x, y);
        System.out.println(getDifference);

        int getProduct = multNumbers(x, y);
        System.out.println(getProduct);

        double getQuotient = divNumbers(x, y);
        System.out.println(getQuotient);
    }
    public static int addNumbers(int x, int y) {
        return x + y;
    }
    public static int subNumbers(int x, int y) {
        return x - y;
    }
    public static int multNumbers(int x, int y) {
        return x * y;
    }
    public static double divNumbers(int x, int y) {
        return x / y;
    }

}
