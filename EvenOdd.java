package HW_Day8;
public class EvenOdd {
   
    static void checkEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }

    public static void main(String[] args) {
        checkEvenOdd(5); 
    }
}

