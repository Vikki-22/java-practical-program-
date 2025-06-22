import java.util.Arrays;

public class Order_arr{
    public static void main(String[] args) {
        // Define a 10-element array
        int[] numbers = {10, 5, 8, 2, 7, 3, 9, 4, 6, 1};

        // Sort in ascending order first
        Arrays.sort(numbers);

        // Reverse the array manually
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }

        // Print the sorted array
        System.out.println("Sorted in descending order:");
        System.out.println(Arrays.toString(numbers));
    }
}
