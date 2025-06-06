abstract class service{
    int a = 10;
    void settings(){
        System.out.println(a);
    }
    abstract void profile();
}

class dk extends service{
    void profile(){
        System.out.println("I can't do this work");
    }
}
public class abst {
    public static void main(String[] args) {
        dk d = new dk();
        d.profile();
    }

    


}

