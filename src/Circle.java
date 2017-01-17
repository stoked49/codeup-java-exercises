/**
 * Created by Irby on 1/17/17.
 */
import java.text.DecimalFormat;
import java.util.*;
import java.lang.Math;



public class Circle {
    Scanner sc = new Scanner(System.in);
    Validator validator = new Validator(sc);

    private double radius;
    private double circumference;
    private double area;

    // number of circles created
    public static int circlesCreated;

    public Circle(double radius) {
        this.radius = radius;
        circlesCreated++;
    }

    public double getCircumference() {
        circumference = 2 * Math.PI * radius;
        return circumference;
    }


    public double getArea() {
        area = Math.PI * (radius * radius);
        return area;
    }
    public String formatNumber(double x) {
       return String.format("%.2f", x);
    }


    public String getFormattedCircumference() {
        return formatNumber(getCircumference());
    }

    public String getFormattedArea() {
        return formatNumber(getArea());
    }
}
