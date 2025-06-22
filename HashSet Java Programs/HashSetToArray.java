
// Write a Java program to convert a HashSet into an array.
import java.util.HashSet;

public class HashSetToArray {
    public static void main(String[] args) {
        // 1. Create and populate the HashSet
        HashSet<Integer> numberSet = new HashSet<>();
        numberSet.add(100);
        numberSet.add(200);
        numberSet.add(300);
        numberSet.add(400);

        // 2. Convert HashSet to an array
        Integer[] numberArray = new Integer[numberSet.size()];
        numberSet.toArray(numberArray);

        // 3. Print the array elements
        System.out.println("Elements in the array:");
        for (int num : numberArray) {
            System.out.println(num);
        }
    }
}
