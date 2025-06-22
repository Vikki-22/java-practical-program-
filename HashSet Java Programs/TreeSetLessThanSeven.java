
// Write a Java program to find numbers less than 7 in a TreeSet.
import java.util.TreeSet;

public class TreeSetLessThanSeven {
    public static void main(String[] args) {
        // 1. Create and populate the TreeSet
        TreeSet<Integer> numberSet = new TreeSet<>();
        numberSet.add(1);
        numberSet.add(3);
        numberSet.add(5);
        numberSet.add(7);
        numberSet.add(9);
        numberSet.add(11);

        // 2. Find numbers less than 7
        TreeSet<Integer> lessThanSeven = new TreeSet<>(numberSet.headSet(7));

        // 3. Display the result
        System.out.println("Original TreeSet: " + numberSet);
        System.out.println("Numbers less than 7: " + lessThanSeven);
    }
}
