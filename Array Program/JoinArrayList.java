
// Write a Java program to join two array lists.
import java.util.ArrayList;

public class JoinArrayList {
    public static void main(String[] args) {
        // First ArrayList
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Red");
        list1.add("Green");
        list1.add("Blue");

        // Second ArrayList
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Yellow");
        list2.add("Purple");
        list2.add("Orange");

        // Join list2 into list1
        list1.addAll(list2);

        // Display the joined ArrayList
        System.out.println("Joined ArrayList: " + list1);
    }
}
