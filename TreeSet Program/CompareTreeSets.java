// Write a Java program to compare two TreeSets. 

import java.util.TreeSet;

public class CompareTreeSets {
    public static void main(String[] args) {
        // First TreeSet
        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);

        // Second TreeSet
        TreeSet<Integer> set2 = new TreeSet<>();
        set2.add(30);
        set2.add(40);
        set2.add(10);
        set2.add(20);

        // Compare sets for equality
        boolean isEqual = set1.equals(set2);
        System.out.println("Are both TreeSets equal? " + isEqual);

        // Find common elements
        TreeSet<Integer> common = new TreeSet<>(set1);
        common.retainAll(set2);
        System.out.println("Common elements: " + common);
    }
}
