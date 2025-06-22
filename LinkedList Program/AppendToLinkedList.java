
// Write a Java program to append a specified element to the end of a linked list. 
import java.util.LinkedList;

public class AppendToLinkedList {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> fruits = new LinkedList<>();

        // Add initial elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("Original LinkedList: " + fruits);

        // Append an element to the end
        fruits.add("Orange");

        System.out.println("LinkedList after appending: " + fruits);
    }
}
