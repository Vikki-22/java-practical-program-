
// Write a Java program to search for an element in an ArrayList.
import java.util.ArrayList;
import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        // Create and populate the ArrayList
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Kolkata");
        cities.add("Chennai");
        cities.add("Bangalore");

        // Display the ArrayList
        System.out.println("Cities List: " + cities);

        // Take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter city to search: ");
        String search = sc.nextLine();

        // Search for the element
        if (cities.contains(search)) {
            System.out.println(search + " found at index " + cities.indexOf(search));
        } else {
            System.out.println(search + " not found in the list.");
        }
    }
}
