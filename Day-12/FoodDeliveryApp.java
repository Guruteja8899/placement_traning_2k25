import java.util.*;
class Order {
    String OrderID;
    String CustomerName;
    public Order(String OrderID ,String CustomerName)
    {
         this.OrderID = OrderID;
         this.CustomerName = CustomerName;
    }  

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }
    
}
public class FoodDeliveryApp {
    public static void main(String[] args) {
        Queue <Order> Orderqueue = new LinkedList<>();

        Orderqueue.add(new Order("ORD101", "Guruteja"));
        Orderqueue.add(new Order("ORD102", "Guru"));
        Orderqueue.add(new Order("ORD103", "GT"));
        Orderqueue.add(new Order("ORD104", "teja"));
        while (!Orderqueue.isEmpty()){
            System.out.println();
            Order CurrentOrder = Orderqueue.poll();
            System.out.println("preparing order :"+ CurrentOrder.OrderID + "CurrentOrder.CustomerName");
            for (int i = 0; i < 3; i++) 
            {
                try{Thread.sleep(1000);}
                catch (Exception e){}
                System.out.print(".");
                
            }
        }


    }

}
