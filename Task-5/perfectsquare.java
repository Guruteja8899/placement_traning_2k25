public class perfectsquare {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        double sqrt = Math.sqrt(n);
        if (sqrt == (int) sqrt) {
            System.out.println(n + " is a perfect square.");
        } else {
            System.out.println(n + " is not a perfect square.");
        }
        sc.close();
    }
    
}
