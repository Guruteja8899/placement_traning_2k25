import java.util.Scanner;
import java.util.Arrays;

public class missingnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" size: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter numbers: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
      
        Arrays.sort(arr);
        
        System.out.println("Missing numbers are: ");
        
        for(int i = 0; i < n - 1; i++) {
            int diff = arr[i + 1] - arr[i];
            if(diff > 1) {
                
                for(int j = 1; j < diff; j++) {
                    System.out.print((arr[i] + j) + " ");
                }
            }
        }
        
        sc.close();
    }
}