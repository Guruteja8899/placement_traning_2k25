import java.util.PriorityQueue;

public class queuepolloperation {
    public static void main(String[] args) {
        // Queue<String> queue = new LinkedList<>();
        // queue.offer("one");
        // queue.offer("two");
        // System.out.println(queue);
        // System.out.println(queue.poll());
        // System.out.println(queue.poll());
        // System.out.println(queue.poll());
        // Queue<Integer>queue=new PriorityQueue<Integer>();
        //queue.offer(18);
        //queue.offer(89);

        // System.out.println(queue);
        // System.out.println("the head is: "+queue.peek());

        PriorityQueue<Integer>queue=new PriorityQueue<Integer>();
        queue.add(4);
        queue.offer(89);
        System.out.println(queue);
        System.out.println("the remove element is:" +queue.remove());
        System.out.println("the head element is:" +queue.element());

    }
    
}
