// Write a Java program to retain common elements from two sets. 

import java.util.HashSet;

public class RetainCommonElements {
    public static void main(String[] args) {
        // 1. Create and populate the first set
        HashSet<String> set1 = new HashSet<>();
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Cherry");
        set1.add("Date");

        // 2. Create and populate the second set
        HashSet<String> set2 = new HashSet<>();
        set2.add("Banana");
        set2.add("Cherry");
        set2.add("Elderberry");
        set2.add("Fig");

        // 3. Retain only the common elements in set1
        set1.retainAll(set2);

        // 4. Display the result
        System.out.println("Common elements: " + set1);
    }
}
