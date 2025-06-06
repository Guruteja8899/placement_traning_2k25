class Outer{
    private String Z = "Private Message";

    class inner{
        void display (){
            System.out.println(Z);
        }
    }
    static class StaticInner  {         //without outer obj it will create 
    void display2(){
        System.out.println("hi this is static inner class");
    }
    }
}
public class innerclass {
    public static void main(String[] args) {
        Outer obj = new Outer();
       // Outer.inner inobj = obj.new inner(); //inner class object
        //inobj.display();

        Outer.StaticInner sobj = new Outer.StaticInner();
        sobj.display2();

    }
    
}
