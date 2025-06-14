import java.util.PriorityQueue;
public class conqtoarr {
    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        q.offer(1);
        q.offer(2);
        q.offer(20);
        Object arr[] = q.toArray();
        System.out.println("From array");
        for (Object a : arr) {
            System.out.println(a);
            
        }
    }
}
