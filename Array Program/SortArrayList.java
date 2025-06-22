
// Write a Java program to sort a given ArrayList.
import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        // Create and populate the ArrayList
        ArrayList<String> names = new ArrayList<>();
        names.add("Ravi");
        names.add("Amit");
        names.add("Zara");
        names.add("Kiran");
        names.add("Neha");

        System.out.println("Original ArrayList: " + names);

        // Sort the ArrayList in ascending order
        Collections.sort(names);

        System.out.println("Sorted ArrayList: " + names);
    }
}
