public class addmatrix {
    public static void main(String[] args) {
        int[][] matrix1 = {{8, 8, 8}, {8, 8, 8}};
        int[][] matrix2 = {{8, 8, 8}, {8, 8, 8}};
        int[][] sum = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(sum[i][j] + " "); 
            }
            System.out.println();
        }
    }
}
    

