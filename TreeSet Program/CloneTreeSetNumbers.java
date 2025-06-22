// Write a Java program to clone a TreeSet into another TreeSet

import java.util.TreeSet;

public class CloneTreeSetNumbers {
    public static void main(String[] args) {
        // Create and populate original TreeSet with numbers
        TreeSet<Integer> originalSet = new TreeSet<>();
        originalSet.add(10);
        originalSet.add(50);
        originalSet.add(20);
        originalSet.add(70);
        originalSet.add(30);

        // Display original TreeSet
        System.out.println("Original TreeSet: " + originalSet);

        // Clone the TreeSet
        @SuppressWarnings("unchecked")
        TreeSet<Integer> clonedSet = (TreeSet<Integer>) originalSet.clone();

        // Display cloned TreeSet
        System.out.println("Cloned TreeSet: " + clonedSet);
    }
}
