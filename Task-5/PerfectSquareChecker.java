import java.util.Scanner;

public class PerfectSquareChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        boolean isPerfectSquare = isPerfectSquare(number);
        System.out.println("Is " + number + " a perfect square? " + isPerfectSquare);
    }

    public static boolean isPerfectSquare(int num) {
        if (num < 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(num);
        return (sqrt * sqrt) == num;
    }
}
