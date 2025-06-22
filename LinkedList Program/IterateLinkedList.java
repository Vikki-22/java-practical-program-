// Write a Java program to iterate through all elements in a linked list.

import java.util.LinkedList;

public class IterateLinkedList {
    public static void main(String[] args) {
        // Create and populate the LinkedList
        LinkedList<String> animals = new LinkedList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        animals.add("Cow");

        System.out.println("Iterating through LinkedList:");

        // Using a for loop with index
        for (int i = 0; i < animals.size(); i++) {
            System.out.println("Element at index " + i + ": " + animals.get(i));
        }
    }
}
