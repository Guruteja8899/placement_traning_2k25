import java.util.Arrays;
public class leaderElements {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int n = arr.length;
        int highestnum = arr[n - 1];
        System.out.print(highestnum + " ");
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > highestnum) {
               highestnum = arr[i];
                System.out.print(highestnum + " ");
            }
        }
    }  
}
