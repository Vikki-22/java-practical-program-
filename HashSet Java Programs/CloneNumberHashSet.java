
// Write a Java program to clone one HashSet into another.
import java.util.HashSet;

public class CloneNumberHashSet {
    public static void main(String[] args) {
        // 1. Create and populate the original HashSet with numbers
        HashSet<Integer> originalSet = new HashSet<>();
        originalSet.add(10);
        originalSet.add(20);
        originalSet.add(30);
        originalSet.add(40);
        originalSet.add(50);

        // 2. Clone the original HashSet into another
        @SuppressWarnings("unchecked")
        HashSet<Integer> clonedSet = (HashSet<Integer>) originalSet.clone();

        // 3. Display both sets
        System.out.println("Original HashSet: " + originalSet);
        System.out.println("Cloned HashSet: " + clonedSet);
    }
}
