//Write a Java program to create a shallow copy of a HashMap instance.

import java.util.HashMap;

public class ShallowCopyHashMap {
    public static void main(String[] args) {
        // 1. Create and populate the original HashMap
        HashMap<Integer, String> originalMap = new HashMap<>();
        originalMap.put(1, "Red");
        originalMap.put(2, "Green");
        originalMap.put(3, "Blue");

        // 2. Create a shallow copy using clone()
        @SuppressWarnings("unchecked")
        HashMap<Integer, String> copiedMap = (HashMap<Integer, String>) originalMap.clone();

        // 3. Display both maps
        System.out.println("Original HashMap: " + originalMap);
        System.out.println("Shallow Copied HashMap: " + copiedMap);
    }
}
