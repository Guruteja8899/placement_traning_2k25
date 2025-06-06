interface PaymentGateway{
    boolean processpayment(double amount);
    String getTransactionId(String trasactionid);
}
class CreditCardPayment implements PaymentGateway{
    public boolean processpayment(double amount){
        System.out.println("Processing payment $" + amount);
        return true;
    }
    public String getTransactionId(String trasactionId){
        return "Credit Card Transaction ID : " + trasactionId;
    }

}
class UPIPayment implements PaymentGateway{
    public boolean processpayment(String amount){
        System.out.println("processing payment $"+amount);
        return true;   
    }
    public String getTransactionId(String transactionid){
        return "UPI Transaction ID :"+transactionid;
    }
    @Override
    public boolean processpayment(double amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'processpayment'");
    }
}
public class abst1 {
    public static void main(String[] args) {
        UPIPayment cc = new UPIPayment();
        cc.processpayment("1000");
        System.out.println(cc.getTransactionId("TNX10"));

    }
    
}
