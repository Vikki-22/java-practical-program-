
// Write a Java program to insert an element into the ArrayList at the first position. 
import java.util.ArrayList;

public class InsertFirst {
    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        System.out.println("Original ArrayList: " + colors);

        // Insert a new element at the first position (index 0)
        colors.add(0, "Yellow");

        System.out.println("After inserting at first position: " + colors);
    }
}
