
import java.util.*;
class Product{
    String name;
    double price;
    public Product(String name,double price){
         this.name = name;
        this.price = price;
    }
}
class shopingCart {
    private ArrayList<Product>items = new ArrayList<>();
    public void addItems(Product product){
        items.add(product);
        System.out.println(product.name + "added to cart");
    }
    public void removeItem(String productName){
        items.removeIf(item-> item.name.equals(productName));
    }
    public void displayCart(){
        System.out.println("your cart");
        items.forEach(item -> System.out.println("-"+item.name+ ": $"+item.price));
    }

}
public class cfw {
    public static void main(String[] args) {
        shopingCart mycart = new shopingCart();
        mycart.addItems(new Product("laptop",999.90));
        mycart.addItems(new Product("mobile",98.90));
        mycart.displayCart();

    }
    
}
