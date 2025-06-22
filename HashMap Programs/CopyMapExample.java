// Write a Java program to copy all mappings from one map to another. 

import java.util.HashMap;
import java.util.Map;

public class CopyMapExample {
    public static void main(String[] args) {
        // 1. Create and populate the first map
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Apple");
        map1.put(2, "Banana");
        map1.put(3, "Cherry");

        // 2. Create a second empty map
        Map<Integer, String> map2 = new HashMap<>();

        // 3. Copy all mappings from map1 to map2
        map2.putAll(map1);

        // 4. Display both maps
        System.out.println("Original Map (map1): " + map1);
        System.out.println("Copied Map (map2): " + map2);
    }
}
