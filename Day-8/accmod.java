class Defaultclass {
    String defaultmessage = "I am Default within the same package accesible ";
    
}
class ModifierExample {
    public String publicmessage = "I am Public access anywhere Accesible ";
    private String privatemessage = "I am Privte within the same package accesible";

    private void displayprivate() {
        System.out.println(privatemessage);
    }
    Defaultclass dc = new Defaultclass();
    public void displayall(){
        System.out.println(dc.defaultmessage);
        System.out.println(publicmessage);
        displayprivate();

    }
}
public class accmod{
    public static void main(String[] args){
        ModifierExample access  = new ModifierExample();
        access.displayall();
    }
}
