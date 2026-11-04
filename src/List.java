import java.util.ArrayList;
import java.util.Arrays;
public class List {
    static void main() {

        // Ways to create a List

        java.util.List<Integer> list = new ArrayList<>();

        java.util.List<String> listOf = java.util.List.of("A", "B"); // Returns an immutable list (don't permit "add", "remove" and "set"). Throws UnsupportedOperationException if changed. Doesn't accept null.

        java.util.List<String> listStrings = Arrays.asList("A", "B", "C"); // Returns a list of fixed size. Permits "set()", but throws an exception if you try to use "add()" or "remove()".

        java.util.List<String> listOfStrings = new ArrayList<>(java.util.List.of("A", "B")); // The correct way to initialize a pré-populated mutable list.

        System.out.println(listOfStrings);

        // Add one element to the list - O(1)
        list.add(1);
        list.add(2);
        list.add(3);

        // Add one element in the list at the specific index and move forward the element who is in the index previously - O(n)
        list.add(1, 10);

        // Get the element at the index you appointed (throw IndexOutOfBoundsException if the index in invalid) - O(1)
        System.out.println(list.get(0));

        // Replace the element on the index, also returns the old element in the index previously - O(1)
        System.out.println(list.set(0, 0));

        // Remove the element on the specified index - O(n)
        list.remove(0);

        // Verify if the element exists on the list - O(n)
        list.contains(0);

        // Search the index in the list for the first occurrence (if there's no occurrence, returns -1) - O(n)
        System.out.println(list.indexOf(0));

        // Returns one vision to a sub-list from the original list, first parameter is the index of start and index of the end you want in the sublist as a second parameter. - O(1)
        System.out.println(list.subList(0, 2));

        System.out.println(list);
    }
}
