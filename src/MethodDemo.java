import java.util.Scanner;

public class MethodDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String myName = getName(scan);
        int favoriteNumber = getNumber(scan);

        String greeting = sayHello(myName, favoriteNumber);
        System.out.println(greeting);
    }

    public static String getName(Scanner sc) {
        System.out.print("What do they call you? ");
        return sc.nextLine();
    }

    public static String sayHello(String myName, int number) {
        return "Hello, " + myName +  ". I heard your favorite number is " + number;
    }

    public static int getNumber(Scanner scan) {
        System.out.print("Input your favorite number: ");
        return scan.nextInt();
    }
}