package Day_10;

interface hr{
    // data member
    int a = 10;
    // member method
    void display();
}
class Office implements hr{
    public  void display(){

        System.out.println("This is Data Member of interface "+a);

    }
}
public class intrfac {
    public static void main(String[] args) {
        Office o = new Office();
        o.display();
        
    }
}
    

