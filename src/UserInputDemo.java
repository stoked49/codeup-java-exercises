/**
 * Created by Irby on 1/3/17.
 */

import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[] args) {
        int firstInteger;
        String firstString;
        String userFirstWord;
        String userSecondWord;
        String userThirdWord;
        String userWantsToContinue;
        double classLength;
        double classWidth;
        double classHeight;




        Scanner sc = new Scanner(System.in);

        System.out.print("Please input an integer: ");
        firstInteger = sc.nextInt();
        System.out.println(firstInteger);



        System.out.print("Please input a sentence: ");
        firstString = sc.next();
        System.out.println(firstString);
        sc.nextLine();


        System.out.print("Next, I'm going to prompt you for 3 words, please enter the 1st word here: ");
        userFirstWord = sc.next();


        System.out.print("Please enter your 2nd word here: ");
        userSecondWord = sc.next();


        System.out.print("Please enter the 3rd word here: ");
        userThirdWord = sc.next();
        System.out.println(userFirstWord);
        System.out.println(userSecondWord);
        System.out.println(userThirdWord);

        System.out.print("Please enter the length of the classroom: ");
        classLength = sc.nextDouble();
        System.out.print("Please enter the width of the classroom: ");
        classWidth = sc.nextDouble();
        System.out.println("The area of the classroom is: " + ((classLength*2) + (classWidth*2)));
        System.out.println("The perimeter of the classroom is: " + (classLength*classWidth));
        sc.nextLine();

        System.out.print("Type 'yes' to continue: ");
        userWantsToContinue = sc.nextLine();
        if(userWantsToContinue.equals("yes") || userWantsToContinue.equals("y")) {
            System.out.println("The user wants to continue");
        } else {
            System.out.println("Thank you! ");
        }
        System.out.print("Please enter the height of the classroom: ");
        classHeight = sc.nextDouble();
        System.out.println("The volume of the classroom is: " + (classLength*classWidth*classHeight));


//        int userInt;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Please enter an integer: ");
//        userInt = sc.nextInt();
//        System.out.println("You entered " + userInt);



    }
}
