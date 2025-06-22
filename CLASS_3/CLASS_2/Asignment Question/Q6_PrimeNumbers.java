import java.util.*;

public class Q6_PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Start number: ");
        int number1 = input.nextInt();
        System.out.print("Enter End number: ");
        int number2 = input.nextInt();
        input.close();

        if (number1 < 2) number1 = 2; // prime numbers start from 2

        if (number2 < number1) {
            System.out.println("Invalid range. End number must be greater than or equal to Start number.");
            return;
        }

        int counter = 0;
        for (int num = number1; num <= number2; num++) {
            if (isPrime(num)) {
                counter++;
                System.out.println(num);
            }
        }

        System.out.println("Total Prime Numbers Between " + number1 + " and " + number2 + " => " + counter);
    }

    static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
