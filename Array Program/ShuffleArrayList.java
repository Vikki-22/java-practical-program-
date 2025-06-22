
//  Write a Java program to shuffle elements in an array list. 
import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArrayList {
    public static void main(String[] args) {
        // Create and populate the ArrayList
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        System.out.println("Original ArrayList: " + colors);

        // Shuffle the list
        Collections.shuffle(colors);

        System.out.println("Shuffled ArrayList: " + colors);
    }
}
