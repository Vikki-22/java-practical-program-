
//82. Write a Java program to test whether a specified key exists in the map
import java.util.HashMap;
import java.util.Map;

public class KeyExistsInMap {
    public static void main(String[] args) {
        // 1. Create and populate the map
        Map<Integer, String> sampleMap = new HashMap<>();
        sampleMap.put(101, "Apple");
        sampleMap.put(102, "Banana");
        sampleMap.put(103, "Cherry");

        // 2. Specify the key to check
        int keyToCheck = 102;

        // 3. Check if the key exists
        if (sampleMap.containsKey(keyToCheck)) {
            System.out.println("Key " + keyToCheck + " exists in the map with value: " + sampleMap.get(keyToCheck));
        } else {
            System.out.println("Key " + keyToCheck + " does not exist in the map.");
        }
    }
}
