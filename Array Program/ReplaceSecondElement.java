
// Write a Java program to replace the second element of an ArrayList with the specified element. 
import java.util.ArrayList;

public class ReplaceSecondElement {
    public static void main(String[] args) {
        // Create and populate the ArrayList
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        System.out.println("Original ArrayList: " + colors);

        // Replace the second element (index 1) with a new value
        colors.set(1, "Yellow");

        System.out.println("Updated ArrayList: " + colors);
    }
}
