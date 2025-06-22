
// Write a Java program to extract a portion of an array list. 
import java.util.ArrayList;
import java.util.List;

public class ExtractSubList {
    public static void main(String[] args) {
        // Create and populate the ArrayList
        ArrayList<String> names = new ArrayList<>();
        names.add("Ravi");
        names.add("Amit");
        names.add("Neha");
        names.add("Kiran");
        names.add("Zara");
        names.add("Nikhil");

        System.out.println("Original ArrayList: " + names);

        // Extract sublist from index 1 (inclusive) to 4 (exclusive)
        List<String> subList = names.subList(1, 4);

        System.out.println("Extracted Portion (index 1 to 3): " + subList);
    }
}
