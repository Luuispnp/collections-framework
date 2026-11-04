import java.util.*;
import java.util.List;

public class Set {
    static void main() {

        HashSet<String> hashSet = new HashSet<>();

        // Add an element to the HashSet - O(1)
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");

        // Verify the presence of the element in the HashSet - O(1)
        hashSet.contains("A");

        // Remove the specified element from the HashSet - O(1)
        hashSet.remove("A");

        // Add all elements from a collection without duplicating - O(n)
        List<String> novosItens = new ArrayList<>(Arrays.asList("D", "E", "F"));
        boolean foiModificado = hashSet.addAll(novosItens);

        // retainAll() - Keeps on the original HashSet only the elements which count in the comparative list - O(n)
        // 1. Creating a list with fruits that we have on refrigerator
        HashSet<String> fruitsOnRefrigerator = new HashSet<>();
        fruitsOnRefrigerator.add("Apple");
        fruitsOnRefrigerator.add("Banana");
        fruitsOnRefrigerator.add("Orange");
        fruitsOnRefrigerator.add("Grape");

        System.out.println("Original refrigerator: " + fruitsOnRefrigerator);

        // 2. Creating a list with fruits where the receipt needs
        List<String> ReceiptFruits = Arrays.asList("Banana", "Grape", "Strawberry");

        // 3. Using retainAll() to keep in the fridge only what we’re going to use in the recipe
        boolean isModified = fruitsOnRefrigerator.retainAll(ReceiptFruits);

        System.out.println("Fruits kept in the refrigerator: " + fruitsOnRefrigerator);
        System.out.println("Did the HashSet get modified?: " + isModified);

        // removeAll() - Removes from the original HashSet the elements that are also present in the provided collection. - O(n)
        List<String> fruitsToBeRemoved = Arrays.asList("Banana", "Grape");
        fruitsOnRefrigerator.removeAll(fruitsToBeRemoved);
        System.out.println(fruitsOnRefrigerator);

        System.out.println(hashSet);
    }
}
