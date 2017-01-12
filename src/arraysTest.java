/**
 * Created by Irby on 1/11/17.
 */
import java.util.Arrays;
public class arraysTest {
    public static void main(String[] args) {
    String [] animals = {"dog", "cat", "pig", "cow"};
        System.out.println(Arrays.toString(animals));

        System.out.println(animals);

        char[] grades = new char[5];
        Arrays.fill(grades, 'A');
        System.out.println(Arrays.toString(grades));
        int[] array1 = {1,2,3,4};
        int[] array2 = {1,2,4,3};

        System.out.println(Arrays.equals(array1, array2));

        String[] foodJustinLikes = {"hamburger", "pie", "potatoes", "kale", "peanut butter"};
        String[] foodPamLikes = Arrays.copyOf(foodJustinLikes, 3);
        String[] students  = {"Ron", "John", "Kevin", "Jeff", "Mittsy"};
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        String[] hayStack = new String[100];
        Arrays.fill(hayStack, 0, 50, "hay");
        Arrays.fill(hayStack, 50, 100, "wheat");

        hayStack[87] = "needle";

        Arrays.sort(hayStack);

        int index = Arrays.binarySearch(hayStack, "needle");
        System.out.println(index);

        System.out.println(Arrays.toString(hayStack));

        String[] topBondFilms = new String[10];
        topBondFilms[8] = "Quantum of Solace";
        topBondFilms = new String[3];

        System.out.println(Arrays.toString(topBondFilms));

//        2 Dimensional Array
        int[][] spreadSheet =  new int[6][6];

        for(int i = 0; i < spreadSheet.length; i ++) {
            System.out.println("");
            for (int j = 0; j < spreadSheet[i].length; j++) {
                System.out.print(spreadSheet[i][j] + " ");
            }
        }
        int[][] jaggedArray = new int[5][];

        int[] row1 = new int[3];
        int[] row2 = new int[10];
        int[] row3 = new int[5];
        int[] row4 = new int[7];
        int[] row5 = new int[2];

        jaggedArray[0] = row1;
        jaggedArray[0] = row2;
        jaggedArray[0] = row3;
        jaggedArray[0] = row4;
        jaggedArray[0] = row5;

        System.out.println("\n");
        for (int[] singleArray : jaggedArray) {
            System.out.println(Arrays.toString(singleArray));
        }




    }
}
