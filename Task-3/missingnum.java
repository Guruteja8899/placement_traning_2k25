public class missingnum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7, 8, 9, 10};
        int n = arr.length;
        int totalSum = (n + 1) * (n + 2) / 2; 
        int arraySum = 0;
        for (int i = 0; i < n; i++) {
            arraySum += arr[i];
        }
        int missingNumber = totalSum - arraySum;
        System.out.println("The missing number is: " + missingNumber);
    }
}
            