
// Write a Java program for trimming the capacity of an array list. 
import java.util.ArrayList;

public class TrimArrayList {
    public static void main(String[] args) {
        // Create an ArrayList with initial capacity
        ArrayList<String> colors = new ArrayList<>(20);

        // Add some elements
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        System.out.println("Size before trimToSize(): " + colors.size());

        // Trim the capacity to the current size
        colors.trimToSize();

        System.out.println("ArrayList trimmed to size. New size: " + colors.size());
    }
}
