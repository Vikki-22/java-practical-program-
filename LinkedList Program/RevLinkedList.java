import java.util.LinkedList;
import java.util.ListIterator;

public class RevLinkedList {
    public static void main(String[] args) {
        // Create and populate the LinkedList
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        System.out.println("LinkedList in reverse order:");

        // Create a ListIterator starting from the end
        ListIterator<String> iterator = colors.listIterator(colors.size());

        // Traverse in reverse
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
