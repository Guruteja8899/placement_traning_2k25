
import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList<>();
        ll.add("milkshake");
        ll.add(108);
        ll.add(8.12);
        ll.addFirst("Guruteja");
        ll.addLast("anu");
        ll.add(2004);
        ll.addAll(ll);
        ll.getFirst();
        System.out.println(ll);
    }
    
}
