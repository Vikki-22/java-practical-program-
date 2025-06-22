import java.util.Scanner;

public class Sum_Average_Arr{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;

        // Accept 10 elements from the user
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        // Calculate average
        double average = sum / 10.0;

        // Display results
        System.out.println("\nSum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);

        scanner.close();
    }
}
