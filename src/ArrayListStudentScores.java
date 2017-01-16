import java.util.*;

/**
 * Created by Irby on 1/13/17.
 */
public class ArrayListStudentScores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Validator validator = new Validator(sc);

//      Declare Variables
        String studentLastName;
        String studentFirstName;
        int studentScore;
        String proceed;

//      Prompt User for Student's last name
        System.out.println("Welcome to the Student Information Portal");
        do {
            studentLastName = validator.getRequiredString("What is the student's last name? : ", sc);
            studentFirstName = validator.getRequiredString("What is the student's first name? : ", sc);
            studentScore = validator.getIntWithinRange("What is the student's score? : ", 0, 100);

            List studentReports = new ArrayList();
            studentReports.add(studentLastName);
            studentReports.add(studentFirstName);
            studentReports.add(studentScore);
        System.out.println(studentReports.size()); // 3
            proceed = validator.getRequiredString("Another Student? ", sc);
    } while (proceed.equalsIgnoreCase("y"));
    }
}
