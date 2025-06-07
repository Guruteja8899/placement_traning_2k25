public class laegestthreenumbers {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int largest = a; 
        
        if (b > largest) {
            largest = b; 
        
        if (c > largest) {
            largest = c; 
        }
        
        System.out.println("The largest of the three numbers is: " + largest);
        sc.close();
        
        }
    }
    
}
