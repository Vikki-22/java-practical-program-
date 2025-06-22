
// Write a Java program to add all elements from one TreeSet to another TreeSet.
import java.util.TreeSet;

public class MergeTreeSets {
    public static void main(String[] args) {
        // First TreeSet with some elements
        TreeSet<String> set1 = new TreeSet<>();
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Mango");

        // Second TreeSet with additional elements
        TreeSet<String> set2 = new TreeSet<>();
        set2.add("Orange");
        set2.add("Grapes");

        System.out.println("TreeSet 1: " + set1);
        System.out.println("TreeSet 2: " + set2);

        // Add all elements of set1 to set2
        set2.addAll(set1);

        System.out.println("TreeSet 2 after adding all elements from TreeSet 1: " + set2);
    }
}
