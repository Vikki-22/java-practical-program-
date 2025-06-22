
// Write a Java program to display the elements of a TreeSet in reverse order.
import java.util.TreeSet;

public class ReverseTreeSet {
    public static void main(String[] args) {
        // Create and populate TreeSet
        TreeSet<String> fruits = new TreeSet<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Orange");

        // Display original TreeSet
        System.out.println("Original TreeSet (ascending order): " + fruits);

        // Display in reverse order
        System.out.println("TreeSet in reverse order: " + fruits.descendingSet());
    }
}
