package HW_Day8;
public class PrimeCheck {
   
    static void checkPrime(int num) {
        if (num <= 1) {
            System.out.println(num + " is not a prime number.");
            return;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println(num + " is not a prime number.");
                return;
            }
        }
        System.out.println(num + " is a prime number.");
    }

    public static void main(String[] args) {
        checkPrime(7); 
    }
}

