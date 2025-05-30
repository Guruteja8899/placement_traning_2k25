import java.util.Scanner;

public class largestnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = 0;
        for(int i = 0;i<3;i++){
            int Z = sc.nextInt();
            if(temp<Z){
                temp=Z;
            }

        }
        System.out.println(temp);

    }
    
}
