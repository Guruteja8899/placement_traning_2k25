class car{
    int model_no;
    String Brand;


 car(int model_no, String Brand){
    this.model_no = model_no;
    this.Brand = Brand;
}
 void show(){
    System.out.println("Model no :"+model_no);
    System.out.println("Brand :"+Brand);
  }
}
public class constructoroverloading {
    public static void main(String[] args) {
        car b = new car(2015,"Benz");
        b.show();
        
    }
}