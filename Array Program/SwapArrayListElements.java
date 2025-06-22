
// Write a Java program that swaps two elements in an array list.
import java.util.ArrayList;
import java.util.Collections;

public class SwapArrayListElements {
    public static void main(String[] args) {
        // Create and populate the ArrayList
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        System.out.println("Original ArrayList: " + colors);

        // Swap elements at index 1 and 3
        Collections.swap(colors, 1, 3);

        System.out.println("ArrayList after swapping index 1 and 3: " + colors);
    }
}
