package HW_Day8;
import java.util.Scanner;

public class CircleCircumference {

    static void calculateCircumference(double radius) {
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference of the circle: " + circumference);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        calculateCircumference(radius);

        sc.close();
    }
}

