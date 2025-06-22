import java.util.Scanner;

public class ArraySum2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = 5;
        int cols = 4; // We'll handle the last element separately
        int[][] arr = new int[rows][cols];
        int sum = 0;

        System.out.println("Enter 17 elements:");

        // Input first 16 elements (4 elements in each of the first 4 rows)
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Stop after 17 elements
                if (count == 17)
                    break;
                System.out.print("Element [" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
                count++;
            }
        }

        // Display the array and sum
        System.out.println("\nArray Elements:");
        count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (count == 17)
                    break;
                System.out.print(arr[i][j] + "\t");
                count++;
            }
            System.out.println();
        }

        System.out.println("\nSum of all 17 elements: " + sum);
    }
}
