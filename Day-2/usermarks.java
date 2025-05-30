import java.util.Scanner;

public class usermarks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pass = 35;

        System.out.println("Enter the maths marks : ");
        int d = sc.nextInt();

        System.out.println("Enter the physics marks : ");
        int b = sc.nextInt();

        System.out.println("Enter the chemistry marks : ");
        int c = sc.nextInt();

        System.out.println("Name: Guruteja Iliyas    reg: 9922005315 9922005343");

        System.out.println("\n----------------------------------------------");
        System.out.println("|Subject     | Marks  | Result");
        System.out.println("|------------|--------|--------|");
        System.out.println("|Maths       | " + d + "     | " + (d >= pass ? "Pass" : "Fail"));
        System.out.println("|Physics     | " + b + "     | " + (b >= pass ? "Pass" : "Fail"));
        System.out.println("|Chemistry   | " + c + "     | " + (c >= pass ? "Pass" : "Fail"));
        System.out.println("----------------------------------------------");

        int total = d + b + c;
        double average = total / 3.0;

        System.out.println("|Total Marks | " + total);
        System.out.printf("|Average     | %.2f\n", average);

        String grade;
        if (average >= 90) {
            grade = "S";
        } else if (average >= 80) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else if (average >= 50) {
            grade = "D";
        } else if (average >= 35) {
            grade = "E";
        } else {
            grade = "F";
        }

        System.out.println("|Grade       | " + grade);

        
        if (d >= pass && b >= pass && c >= pass) {
            System.out.println("|Overall     | PASS");
        } else {
            System.out.println("|Overall     | FAIL");
        }

        
        System.out.println("\nEven/Odd Check:");
        System.out.println("Maths: " + d + (d % 2 == 0 ? " is even." : " is odd."));
        System.out.println("Physics: " + b + (b % 2 == 0 ? " is even." : " is odd."));
        System.out.println("Chemistry: " + c + (c % 2 == 0 ? " is even." : " is odd."));

        sc.close();
    }
}

