/**
 * Created by Irby on 1/3/17.
 */

import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[] args) {
        String firstInput;
        int secondInput;
        String thirdInput;

        Scanner sc = new Scanner(System.in);

        System.out.print("Please input your input: ");
        firstInput = sc.nextLine();
        System.out.print("Please input your an integer: ");
        secondInput = sc.nextInt();
        System.out.print("Please input your third input: ");
        thirdInput = sc.nextLine();

        System.out.println(firstInput);
        System.out.println(secondInput);
        System.out.println(thirdInput);
    }
}
