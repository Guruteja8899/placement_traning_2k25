interface hr{
    int a = 10;
    void display();
}
interface finance {
    void budget();
}
interface Operations{
    void SOP();
}
class Legal_Office{
    void Law(){
        System.out.println("Indian Laws");
    }
}
class Office extends Legal_Office implements hr,finance,Operations{
    public void display(){
        System.out.println("This is data member of interface "+a);
    }
    public void budget(){
        System.out.println("Budget from finance ");
    }
    public void SOP(){
        System.out.println("Standard operating procedure from Operations");
    }
}
public class multipleinheritance {
    public static void main(String[] args) {
        Office o = new Office();
        o.display();
        o.budget();
        o.SOP();
        o.Law();      
    }   
}
