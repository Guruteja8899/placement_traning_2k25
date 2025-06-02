import java.util.Scanner;
import java.util.Arrays;
public class frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();    
        int[] arr = new int[n]; 
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] frequency = new int[n];   
        int visited = -1; 
        for (int i = 0; i < n; i++) {
            int count = 1; 
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    frequency[j] = visited; 
                }
            }
            if (frequency[i] != visited) {
                frequency[i] = count; 
                
            }
        }
        
    }
    
}
