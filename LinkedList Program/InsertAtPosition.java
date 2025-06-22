
// Write a Java program to insert a specified element at a given position in a linked list. 
import java.util.LinkedList;

public class InsertAtPosition {
    public static void main(String[] args) {
        // Create and populate the LinkedList
        LinkedList<String> languages = new LinkedList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");

        System.out.println("Original LinkedList: " + languages);

        // Insert element at a specific position (index 1)
        languages.add(1, "JavaScript");

        System.out.println("LinkedList after insertion: " + languages);
    }
}
