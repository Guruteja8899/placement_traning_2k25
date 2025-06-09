import java.util.Scanner;

public class DoubleNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int doubled = number * 2;
        System.out.println("The double of " + number + " is " + doubled);
        scanner.close();
    }
}
