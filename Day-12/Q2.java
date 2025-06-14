import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
public class Q2 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");

        Iterator<String> itr = queue.iterator();
        while(itr.hasNext()){
            System.out.print(queue.peek());
            System.out.print(queue.poll() + " ");

        }
        System.out.print("\n" + queue.peek());

    }
}
        


