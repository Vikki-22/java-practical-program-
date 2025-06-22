
// Write a Java program to iterate through all elements in an ArrayList. 
import java.util.ArrayList;
import java.util.Iterator;

public class IterateArrayList {
    public static void main(String[] args) {
        // Create an ArrayList and add elements
        ArrayList<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Banana");
        items.add("Mango");
        items.add("Grapes");

        System.out.println("Using for loop:");
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i));
        }

        System.out.println("\nUsing for-each loop:");
        for (String item : items) {
            System.out.println(item);
        }

        System.out.println("\nUsing Iterator:");
        Iterator<String> it = items.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\nUsing forEach() method (Java 8+):");
        items.forEach(System.out::println);
    }
}
