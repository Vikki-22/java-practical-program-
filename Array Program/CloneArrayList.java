// Write a Java program to clone an array list to another array list.

import java.util.ArrayList;

public class CloneArrayList {
    public static void main(String[] args) {
        // Original ArrayList
        ArrayList<String> originalList = new ArrayList<>();
        originalList.add("Red");
        originalList.add("Green");
        originalList.add("Blue");

        // Clone the ArrayList
        @SuppressWarnings("unchecked")
        ArrayList<String> clonedList = (ArrayList<String>) originalList.clone();

        // Display both lists
        System.out.println("Original ArrayList: " + originalList);
        System.out.println("Cloned ArrayList: " + clonedList);
    }
}
