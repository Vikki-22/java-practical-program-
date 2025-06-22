// Write a Java program to retrieve an element at a specified index from a given ArrayList. 

import java.util.ArrayList;
import java.util.Scanner;

public class RetrieveElement {
    public static void main(String[] args) {
        // Create and populate the ArrayList
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("Orange");

        // Display the list
        System.out.println("Fruits List: " + fruits);

        // Ask the user for index input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index (0 to " + (fruits.size() - 1) + ") to retrieve element: ");
        int index = sc.nextInt();

        // Check for valid index and retrieve the element
        if (index >= 0 && index < fruits.size()) {
            String item = fruits.get(index);
            System.out.println("Element at index " + index + ": " + item);
        } else {
            System.out.println("Invalid index!");
        }
    }
}
