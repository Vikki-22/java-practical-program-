//Write a Java program to remove all elements from a HashSet. 

import java.util.HashSet;

public class RemoveAllFromHashSet {
    public static void main(String[] args) {
        // 1. Create and populate the HashSet with numbers
        HashSet<Integer> numberSet = new HashSet<>();
        numberSet.add(10);
        numberSet.add(20);
        numberSet.add(30);
        numberSet.add(40);

        // 2. Display the original HashSet
        System.out.println("Original HashSet: " + numberSet);

        // 3. Remove all elements
        numberSet.clear();

        // 4. Display the HashSet after removal
        System.out.println("HashSet after removing all elements: " + numberSet);
    }
}
