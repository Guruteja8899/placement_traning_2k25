import java.util.PriorityQueue;
import java.util.Queue;
public class queue {
    public static void main(String[] args) {
        Queue<Integer>queue=new PriorityQueue<Integer>();
        queue.add(5);
        queue.add(4);
        queue.add(3);
        queue.add(2);
        queue.add(1);
        System.out.println(queue);

    }
    
}
