
// Write a Java program to remove the third element from an ArrayList.
import java.util.ArrayList;

public class RemoveThirdElement {
    public static void main(String[] args) {
        // Create and populate the ArrayList
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Elephant");
        animals.add("Tiger");
        animals.add("Lion");

        System.out.println("Original ArrayList: " + animals);

        // Remove the third element (index 2)
        if (animals.size() >= 3) {
            animals.remove(2); // Index starts from 0
            System.out.println("ArrayList after removing third element: " + animals);
        } else {
            System.out.println("ArrayList does not have a third element to remove.");
        }
    }
}
