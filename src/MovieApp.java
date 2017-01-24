import validation.Validator;

import java.util.*;

/**
 * Created by Irby on 1/17/17.
 */


public class MovieApp {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Validator validator = new Validator(sc);
        String proceed;
        String userCategory;

        // Create the ArrayList to store the Movie class object
        ArrayList<Movie> movieList = new ArrayList<>();




        // Assemble the arrayList of movieObjects
        for (int i = 1; i <= 100; i++) {
            movieList.add(MoviesIO.getMovie(i));
        }


        ArrayList<Movie> animated = new ArrayList<>();
        ArrayList<Movie> drama = new ArrayList<>();
        ArrayList<Movie> comedy = new ArrayList<>();
        ArrayList<Movie> musical = new ArrayList<>();
        ArrayList<Movie> horror = new ArrayList<>();
        ArrayList<Movie> scifi = new ArrayList<>();


        for (Movie movie : movieList) {
            if (movie.getCategory().equalsIgnoreCase("animated")) {
                animated.add(movie);
            } else if (movie.getCategory().equalsIgnoreCase("drama")) {
                drama.add(movie);
            } else if (movie.getCategory().equalsIgnoreCase("comedy")) {
                comedy.add(movie);
            } else if (movie.getCategory().equalsIgnoreCase("musical")) {
                musical.add(movie);
            } else if (movie.getCategory().equalsIgnoreCase("horror")) {
                horror.add(movie);
            } else if (movie.getCategory().equalsIgnoreCase("scifi")) {
                scifi.add(movie);
            }
        }


            System.out.println("Welcome to watchwatchin");
            System.out.println("There are 100 movies in the list");


            do {

                System.out.println("Categories include: Animated, Drama, Comedy, Musical, Horror, and SciFi. ");
                userCategory = validator.getRequiredString("Which category are you interested in? : ");

                switch (userCategory) {
                    case "animated":
                        System.out.println(animated);
                        break;
                    case "drama":
                        System.out.println(drama);
                        break;
                    case "comedy":
                        System.out.println(comedy);
                        break;
                    case "musical":
                        System.out.println(musical);
                        break;
                    case "horror":
                        System.out.println(horror);
                        break;
                    case "scifi":
                        System.out.println(scifi);
                        break;
                }
                sc.nextLine();
                proceed = validator.getRequiredString("Another category? ");
            } while (proceed.equalsIgnoreCase("y"));
    }

}
