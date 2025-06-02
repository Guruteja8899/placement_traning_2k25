import java.util.ArrayList;

public class dynamicarray { 
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                row.add((i * 3) + j + 1);
            }
            arr.add(row);
        }
        for (ArrayList<Integer> row : arr) {
            for (int val : row) {
                System.out.println(val);
            }
        }
    }
}
