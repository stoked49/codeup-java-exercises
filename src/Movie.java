/**
 * Created by Irby on 1/17/17.
 */
public class Movie {
    private String title;
    private String category;

    @Override
    public String toString() {
        return title;
    }

    public Movie(String title, String category) {
        this.title = title;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }
}
