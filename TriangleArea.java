package HW_Day8;
import java.util.Scanner;

public class TriangleArea {

    static void calculateArea(double base, double height) {
        double area = 0.5 * base * height;
        System.out.println("Area of the triangle: " + area);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base of the triangle: ");
        double base = sc.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = sc.nextDouble();

        calculateArea(base, height);

        sc.close();
    }
}
