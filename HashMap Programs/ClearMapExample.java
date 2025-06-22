//Write a Java program to remove all key-value pairs from a map.

import java.util.HashMap;
import java.util.Map;

public class ClearMapExample {
    public static void main(String[] args) {
        // 1. Create and populate the map
        Map<Integer, String> fruitMap = new HashMap<>();
        fruitMap.put(1, "Apple");
        fruitMap.put(2, "Banana");
        fruitMap.put(3, "Cherry");

        // 2. Display the original map
        System.out.println("Original Map: " + fruitMap);

        // 3. Remove all key-value pairs
        fruitMap.clear();

        // 4. Display the map after clearing
        System.out.println("Map after removing all key-value pairs: " + fruitMap);
    }
}
