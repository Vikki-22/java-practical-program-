
// Write a Java program to create an ArrayList, add some colors (as strings), and print the collection.
import java.util.ArrayList;

public class ColorList {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> colors = new ArrayList<>();

        // Add color names to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        // Print the ArrayList
        System.out.println("Colors in the list:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
