
// Write a Java program to compare two HashSets.
import java.util.HashSet;

public class CompareHashSets {
    public static void main(String[] args) {
        // 1. Create and populate the first HashSet
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        // 2. Create and populate the second HashSet
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

        // 3. Compare sets to find common elements
        HashSet<Integer> commonElements = new HashSet<>(set1);
        commonElements.retainAll(set2); // intersection

        // 4. Display sets and comparison result
        System.out.println("HashSet 1: " + set1);
        System.out.println("HashSet 2: " + set2);
        System.out.println("Common elements: " + commonElements);
    }
}
