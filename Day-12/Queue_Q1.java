import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Scanner;

public class Queue_Q1 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
        int a,b,c,d,e;
        dq.add(s1.nextInt());
        dq.add(s1.nextInt());
        dq.add(s1.nextInt());
        dq.add(s1.nextInt());
        dq.add(s1.nextInt());
        dq.removeLast();

        Iterator<Integer> itr = dq.iterator();
        System.out.println(" ");
            while(itr.hasNext())
        {
            System.out.println(itr.next());
        }    
    }
    
}
