
//Sort a ten element array in descending order. 
import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class DescendingSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] arr = new Integer[10]; // Using Integer for Collections.reverseOrder()

        // Input 10 elements
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort in descending order
        Arrays.sort(arr, Collections.reverseOrder());

        // Display sorted array
        System.out.println("Array in descending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
