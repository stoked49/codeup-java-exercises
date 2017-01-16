import java.util.*;

/**
 * Created by Irby on 1/13/17.
 */
public class StudentScoresArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Validator validator = new Validator(sc);

//      Declare Variables
        String studentLastName;
        String studentFirstName;
        double studentScore;
        String proceed;


//      Create ArrayList to stor ehe Student Class objects created
        ArrayList <Student> studentReports = new ArrayList<Student>();

//      Welcome User to the App
        System.out.println("Welcome to the Student Information Portal");
        do {
//          Prompt User for Student's information
            studentLastName = validator.getRequiredString("What is the student's last name? : ");
            studentFirstName = validator.getRequiredString("What is the student's first name? : ");
            studentScore = validator.getDouble("What is the student's score? : ");

//            Create a new Student object to store the next user input
            Student student = new Student(studentLastName, studentFirstName, studentScore);
            studentReports.add(student);
//            Collections.sort(studentReports);

//          Iterate across the ArrayList using a for loop
            for (int i = 0; i <studentReports.size(); i++) {
                System.out.println(studentReports.get(i).getFullName());
                System.out.println(studentReports.get(i).getScore());
            }
        sc.nextLine();
            proceed = validator.getRequiredString("Another Student? ");
    } while (proceed.equalsIgnoreCase("y"));
    }
}
