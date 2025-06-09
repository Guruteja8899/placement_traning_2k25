public class SmallestInArray {
    public static void main(String[] args) {
        int[] numbers = {34, 15, 88, 2, 7};
        int smallest = findSmallest(numbers);
        System.out.println("The smallest number in the array is: " + smallest);
    }

    public static int findSmallest(int[] array) {
        int smallest = array[0];
        for (int number : array) {
            if (number < smallest) {
                smallest = number;
            }
        }
        return smallest;
    }
}
