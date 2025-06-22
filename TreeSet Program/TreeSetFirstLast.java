
// Write a Java program to retrieve the first and last elements from a TreeSet.
import java.util.TreeSet;

public class TreeSetFirstLast {
    public static void main(String[] args) {
        // Create and populate TreeSet
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        // Display TreeSet
        System.out.println("TreeSet: " + colors);

        // Retrieve and display the first and last elements
        String first = colors.first();
        String last = colors.last();

        System.out.println("First element: " + first);
        System.out.println("Last element: " + last);
    }
}
