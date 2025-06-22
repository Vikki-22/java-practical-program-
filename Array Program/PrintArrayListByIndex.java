// Write a Java program to print all the elements of an ArrayList using the elements' position. 

import java.util.ArrayList;

public class PrintArrayListByIndex {
    public static void main(String[] args) {
        // Create and populate the ArrayList
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        System.out.println("ArrayList elements using index:");

        // Loop through the ArrayList using positions (index)
        for (int i = 0; i < colors.size(); i++) {
            System.out.println("Element at index " + i + ": " + colors.get(i));
        }
    }
}
