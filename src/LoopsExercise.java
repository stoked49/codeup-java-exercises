import java.util.Scanner;

/**
 * Created by Irby on 1/4/17.
 */
public class LoopsExercise {
    public static void main(String[] args) {
        int i = 5;
        int ii;
        double iii;
        int z = 0;
        String userInput;
        int number;

    // todo While exercise
        while (i <= 15) {
            System.out.println("i is " + i);
            i++;
        }

    // todo (100 to -10) by 5's
        for (ii = 100; ii>= -10; ii-=5) {
            System.out.println("ii is " + ii);
        }
//        do {
//            //statements
//            System.out.println("ii is " + ii);
//            ii -= 5;
//        }while(ii >= -10);

    // (2 to 1000000)
        for (iii = 2; iii<= 1000000; iii*=iii) {
            System.out.println("iii is " + iii);
        }
//        do {
//            System.out.println("x is " + x);
//            x *= x;
//        }while(x <= 1000000);

        // todo FizzBuzz test
        for (z = 1; z<=100; z+=1) {
            if (z%3==0 && z%5==0) {
                System.out.println("FizzBuzz");
            } else if (z%3==0) {
                System.out.println("Fizz");
            } else if(z%5==0) {
                System.out.println("Buzz");
            } else {
                System.out.println(z);
            }
        }
        // todo Table Exercise
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Please input an integer: ");
            number = sc.nextInt();

            System.out.println("         Number  |   Square  |   Cube    ");
            System.out.println("       --------------------------------");
            for(int t = 1; t <= number; t++) {
                System.out.printf("%12s", t);
                System.out.printf("%12s", t*t);
                System.out.printf("%12s", t*t*t);
                System.out.println("");
            }
            System.out.print("Do you want to continue?");
            userInput = sc.next();
        } while(userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y"));

        System.out.println("thank you for using the table powers app :)");
    }
}
