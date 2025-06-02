import java.util.Scanner;
public class sumofrows {
    public static void main(String[] args) {
        int[][] arr = 
        {
            {62, 42, 93},
            {91, 43, 86},
            {56, 78, 99}
        };
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + ": " + sum);
        }    
    }
    
}
