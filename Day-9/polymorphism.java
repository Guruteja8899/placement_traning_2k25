

class show{
    int add(int a,int b){
        return a+b;
    }
    double add (double a, double b){
        return a+b;

    }
    String add(String a,String b){  
        return a+b;
    }
}

public class polymorphism {
    public static void main(String[] args) {
        show b = new show();
        System.out.println(b.add(10,20));
        
    }
}
