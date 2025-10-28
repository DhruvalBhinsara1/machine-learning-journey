import java.util.LinkedList;

public class Linked_Lists {

    public static void main(String[] args) {
        
        LinkedList<String> list = new LinkedList<>();

        // Add elements to the list
        list.add("Karen");
        list.add("Chad");
        list.add("Steve");
        list.add("Monica");

        // Print the first element
        System.out.println(list.getFirst());

        // Remove the first element
        list.removeFirst();

        // Print the updated list
        System.out.println(list);

        // Iterate over the list and print elements
        for (String name : list) {
            System.out.println(name);
        }
    }
}
