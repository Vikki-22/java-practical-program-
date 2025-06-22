
// Write a Java program to convert a HashSet into a TreeSet.
import java.util.HashSet;
import java.util.TreeSet;

public class HashSetToTreeSet {
    public static void main(String[] args) {
        // 1. Create and populate the HashSet
        HashSet<Integer> numberSet = new HashSet<>();
        numberSet.add(50);
        numberSet.add(20);
        numberSet.add(70);
        numberSet.add(10);
        numberSet.add(40);

        // 2. Convert HashSet to TreeSet
        TreeSet<Integer> sortedSet = new TreeSet<>(numberSet);

        // 3. Display both sets
        System.out.println("Original HashSet: " + numberSet);
        System.out.println("Converted TreeSet (Sorted): " + sortedSet);
    }
}
