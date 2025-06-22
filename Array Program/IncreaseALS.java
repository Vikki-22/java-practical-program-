
// Write a Java program to increase an array list size.
import java.util.ArrayList;

public class IncreaseALS {
    public static void main(String[] args) {
        // Create an ArrayList with default capacity
        ArrayList<String> colors = new ArrayList<>();

        // Add some elements
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // Print size before increasing capacity
        System.out.println("Size before ensureCapacity: " + colors.size());

        // Increase the capacity to hold at least 20 elements
        colors.ensureCapacity(20);

        // Add more elements (optional demonstration)
        colors.add("Yellow");
        colors.add("Purple");

        // Print size after increasing capacity
        System.out.println("Size after adding more elements: " + colors.size());
        System.out.println("ArrayList: " + colors);
    }
}
