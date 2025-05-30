import java.util.Scanner;
public class inputfromuser {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pass = 35;
        System.out.println("Enter the maths marks : ");
        int d = sc.nextInt();
        System.out.println("Enter the physic marks : ");
           int b = sc.nextInt();
        System.out.println("Enter the chemistery marks : ");
           int c = sc.nextInt();
           System.out.println("Name:Guruteja Iliyas    reg:9922005315 9922005343" );
           System.out.println("\n----------------------------------------------");
           System.out.println("|subject     | marks  | result");
           System.out.println("|            |        |");
           System.out.println("|maths       |"+   d+ (d >= pass ? "      |pass" : "    |fail"));
           System.out.println("|physics     |"+  b + (b >= pass ? "      |pass" : " |fail")); 
           System.out.println("|chemistry   |"+  c + (c >= pass ? "      |pass" : " |fail"));
           System.out.println("\n----------------------------------------------");
           System.out.println("|total marks | " +(d+b+c));
           System.out.println("|average " +(d+b+c)/3);
           
           
          if (d % 2 == 0) {
            System.out.println(d + " is even."); 
          if (b % 2 == 0) {
            System.out.println(b + " is even.");
        } else {
            System.out.println(b + " is odd.");
        }
            if (c % 2 == 0) {
               System.out.println(c + " is even.");
         } else {
               System.out.println(c + " is odd.");
         }
         } else {
               System.out.println(d + " is odd.");
         }
         
         
    }
        
    }