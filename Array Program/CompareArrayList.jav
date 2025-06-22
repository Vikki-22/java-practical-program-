// Write a Java program to compare two array lists. 
import java.util.ArrayList;

public class CompareArrayLists {
    public static void main(String[] args) {
        // First ArrayList
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Red");
        list1.add("Green");
        list1.add("Blue");

        // Second ArrayList
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Red");
        list2.add("Green");
        list2.add("Blue");

        // Third ArrayList (different content)
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Red");
        list3.add("Yellow");
        list3.add("Blue");

        // Compare list1 and list2
        boolean isEqual1 = list1.equals(list2);
        System.out.println("list1 and list2 are equal: " + isEqual1);

        // Compare list1 and list3
        boolean isEqual2 = list1.equals(list3);
        System.out.println("list1 and list3 are equal: " + isEqual2);
    }
}
