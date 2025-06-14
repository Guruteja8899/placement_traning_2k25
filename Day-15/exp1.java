import java.util.Scanner;

public class exp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        char namearr[] = name.toUpperCase().toCharArray();
        for (char c : namearr){
            System.out.printf("%d ",c-64);
        }  
    }  
}
