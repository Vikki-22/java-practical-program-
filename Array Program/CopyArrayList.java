
// Write a Java program to copy one array list into another. 
import java.util.ArrayList;
import java.util.Collections;

public class CopyArrayList {
    public static void main(String[] args) {
        // Source ArrayList
        ArrayList<String> sourceList = new ArrayList<>();
        sourceList.add("Red");
        sourceList.add("Green");
        sourceList.add("Blue");

        // Destination ArrayList with same size as source
        ArrayList<String> destinationList = new ArrayList<>(sourceList.size());

        // Fill destinationList with nulls to match source size
        for (int i = 0; i < sourceList.size(); i++) {
            destinationList.add(null);
        }

        // Copy elements from sourceList to destinationList
        Collections.copy(destinationList, sourceList);

        // Display the lists
        System.out.println("Source List: " + sourceList);
        System.out.println("Destination List after copy: " + destinationList);
    }
}
