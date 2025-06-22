//Write a Java program to check if a map is empty or contains key-value mappings. 

import java.util.HashMap;
import java.util.Map;

public class CheckMapEmpty {
    public static void main(String[] args) {
        // 1. Create a map
        Map<Integer, String> myMap = new HashMap<>();

        // 2. Check if the map is empty
        if (myMap.isEmpty()) {
            System.out.println("The map is currently empty.");
        } else {
            System.out.println("The map contains key-value pairs: " + myMap);
        }

        // 3. Add some entries
        myMap.put(1, "Java");
        myMap.put(2, "Python");

        // 4. Check again
        if (myMap.isEmpty()) {
            System.out.println("The map is empty.");
        } else {
            System.out.println("Now the map contains: " + myMap);
        }
    }
}
