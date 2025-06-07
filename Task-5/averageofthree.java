import java.util.Scanner;
public class averageofthree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("a,b,c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int average = (a + b + c) / 3;
        System.out.println("The average of the three numbers is: " + average);
        sc.close(); 

    }
}