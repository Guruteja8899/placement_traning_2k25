// single level inheritance
class math{
    void formula(){
        System.out.println("(A+B)^2 = A^2 + B^2 + 2AB");
    }
}
class chemistry extends math{
    void display(){
        System.out.println("nothing");
    }
 
}
// multi level inheritance
//class physics extends chemistry{
//    void show(){
//        System.out.println("access");
//    }
//}
// hierachical level inheritance
class physics extends math{
    void show1(){
        System.out.println("pro");
    }
}

public class inheritance {
    public static void main(String[] args) {
        chemistry ch = new chemistry();
        ch.display();
        ch.formula(); 
        physics p = new physics();
        p.show1();
    } 
}
