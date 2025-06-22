
// Write a Java program to count the number of elements in a TreeSet.
import java.util.TreeSet;

public class TreeSetCount {
    public static void main(String[] args) {
        // Create and populate TreeSet with numbers
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Display TreeSet
        System.out.println("TreeSet Elements: " + numbers);

        // Count elements using size()
        int count = numbers.size();
        System.out.println("Total number of elements in TreeSet: " + count);
    }
}
