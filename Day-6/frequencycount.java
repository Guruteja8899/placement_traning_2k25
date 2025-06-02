public class frequencycount {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 4, 4};
        int[] frequency = new int[5]; 

        for (int i = 0; i < arr.length; i++) {
            frequency[arr[i]]++;
        }

        System.out.println("Number\tFrequency");
        for (int i = 1; i < frequency.length; i++) {
            System.out.println(i + "\t" + frequency[i]);
        }
    }

    
    
    
}
