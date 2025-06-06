class AnimalSound{
    void sound(){
        System.out.println("Animal makes sound");
    }

} 
class Dog extends AnimalSound{
    void sound(){
        System.out.println("Barks");
    
    }
}
class cat extends AnimalSound{
    void sound(){
        System.out.println("Meows");
    }

}
public class pms {
    public static void main(String[] args) {
        AnimalSound animal = new AnimalSound();
        animal.sound();
        Dog chimtu = new Dog();
        chimtu.sound();
        cat sai = new cat();
        sai.sound();
    }
    
}
