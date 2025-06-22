// Write a Java program to iterate through all elements starting from a specified position in a linked list. 

import java.util.LinkedList;

public class IterateFromPosition {
    public static void main(String[] args) {
        // Create and populate the LinkedList
        LinkedList<String> cities = new LinkedList<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Chennai");
        cities.add("Kolkata");
        cities.add("Bangalore");

        // Specify the starting index
        int startIndex = 2;

        System.out.println("Iterating from index " + startIndex + ":");

        // Check for valid index and iterate
        if (startIndex >= 0 && startIndex < cities.size()) {
            for (int i = startIndex; i < cities.size(); i++) {
                System.out.println("Element at index " + i + ": " + cities.get(i));
            }
        } else {
            System.out.println("Invalid starting index!");
        }
    }
}
