
import java.util.*;

public class collectionss {
    public static void main (String[] args){
        ArrayList al = new ArrayList<>();
        al.add("guru");
        al.add("teja");
        al.add("chitta");
        al.add("man");

        Collections.shuffle(al);
        System.out.println(al);
        al.sort(null);
        System.out.println(al);

    }
    
}
