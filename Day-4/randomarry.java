import java.util.Scanner;


public class randomarry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the   number ");
        int n= sc.nextInt();
        int[] a={1,2,3,4,5,6};
        for(int i=0;i<=a.length;i++)
        {
            if (n==a[i])
            {
                System.out.println("present");  
            }
        }
        System.out.println("not present");
       
       
    }
    
}