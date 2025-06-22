// Write a Java program to insert elements at the first and last positions of a
// linked list.

import java.util.LinkedList;

public class InsertFirstLast {
    public static void main(String[] args) {
        // Create and populate the LinkedList
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Grapes");

        System.out.println("Original LinkedList: " + fruits);

        // Insert element at the first position
        fruits.addFirst("Apple");

        // Insert element at the last position
        fruits.addLast("Orange");

        System.out.println("LinkedList after inserting at first and last: " + fruits);
    }
}
