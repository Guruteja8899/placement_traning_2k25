import java.util.Scanner;
public class natural {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int sum = n * (n + 1) / 2;
            System.out.println("Sum of the first " + n + " natural numbers is: " + sum);
        }
        scanner.close();
    }
}
