package HW_Day8;
import java.util.*;

public class Calculator {


    static void add(int num1, int num2) {
        System.out.println("Addition: " + (num1 + num2));
    }


    static void subtract(int num1, int num2) {
        System.out.println("Subtraction: " + (num1 - num2));
    }

    static void multiply(int num1, int num2) {
        System.out.println("Multiplication: " + (num1 * num2));
    }

    static void divide(int num1, int num2) {
        if (num2 != 0) {
            System.out.println("Division: " + (num1 / (float) num2));
        } else {
            System.out.println("Error: Division by zero.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
      
        add(num1, num2);
        subtract(num1, num2);
        multiply(num1, num2);
        divide(num1, num2);

        sc.close();
    }
}

