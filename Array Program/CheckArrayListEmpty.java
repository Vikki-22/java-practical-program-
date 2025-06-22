
// Write a Java program to test whether an array list is empty or not.
import java.util.ArrayList;

public class CheckArrayListEmpty {
    public static void main(String[] args) {
        // Create an empty ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Check if the ArrayList is empty
        if (colors.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        } else {
            System.out.println("The ArrayList is not empty.");
        }

        // Add an element
        colors.add("Red");

        // Check again after adding an element
        if (colors.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        } else {
            System.out.println("The ArrayList is not empty.");
        }
    }
}
