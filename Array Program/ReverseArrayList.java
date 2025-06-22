
// Write a Java program to reverse elements in an array list.
import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
    public static void main(String[] args) {
        // Create and populate the ArrayList
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        System.out.println("Original ArrayList: " + colors);

        // Reverse the list
        Collections.reverse(colors);

        System.out.println("Reversed ArrayList: " + colors);
    }
}
