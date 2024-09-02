import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Access elements
        System.out.println("First fruit: " + fruits.get(0));

        // Remove an element
        fruits.remove("Banana");

        // Iterate using for-each loop
        System.out.println("Fruits in the list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Iterate using Iterator
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Check size and presence
        System.out.println("Size of the list: " + fruits.size());
        System.out.println("Contains Cherry: " + fruits.contains("Cherry"));

        // Clear the list
        fruits.clear();
        System.out.println("Size after clearing: " + fruits.size());
    }
}
