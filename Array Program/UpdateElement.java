// Write a Java program to update an ArrayList element by a given element. 

import java.util.ArrayList;
import java.util.Scanner;

public class UpdateElement {
    public static void main(String[] args) {
        // Create and populate the ArrayList
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        System.out.println("Original ArrayList: " + colors);

        Scanner sc = new Scanner(System.in);

        // Get the element to be replaced
        System.out.print("Enter the element to replace: ");
        String oldElement = sc.nextLine();

        // Get the new element
        System.out.print("Enter the new element: ");
        String newElement = sc.nextLine();

        // Check if the element exists and update
        if (colors.contains(oldElement)) {
            int index = colors.indexOf(oldElement);
            colors.set(index, newElement);
            System.out.println("Updated ArrayList: " + colors);
        } else {
            System.out.println("Element '" + oldElement + "' not found in the list.");
        }
    }
}
