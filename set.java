import java.util.LinkedHashSet;
import java.util.Set;
public class set {
    public static void main(String[] args){
        //Set obj = new HashSet();
        Set obj = new LinkedHashSet();
        obj.add("guru9922005315");
        obj.add("iliyas9922005343");
        obj.add("sai9922005148");
        obj.add("naveen9922005300");
        obj.add("teja992200206");
        System.out.println(obj);
        obj.remove("guru9922005315");
        System.out.println(obj);
        obj.add("sai9922005148");
        obj.retainAll(obj);
    
    
    
       
       

    }
}
