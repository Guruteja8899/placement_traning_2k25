import java.util.*;
public class Queue_Q4 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        for (int i = 1; i <=10; i++) {
            q.add(i);
        }
        Iterator<Integer> itr = q.iterator();
        while (itr.hasNext()){
            if (q.peek()%2 ==0){
                System.out.println(q.poll());
            }
            else q.poll();
        }
    }
    
}
