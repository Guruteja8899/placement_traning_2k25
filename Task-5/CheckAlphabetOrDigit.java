import java.util.Scanner;

public class CheckAlphabetOrDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);

        if (Character.isLetter(inputChar)) {
            System.out.println(inputChar + " is an alphabet letter.");
        } else if (Character.isDigit(inputChar)) {
            System.out.println(inputChar + " is a digit.");
        } else {
            System.out.println(inputChar + " is neither an alphabet letter nor a digit.");
        }

        scanner.close();
    }
}
