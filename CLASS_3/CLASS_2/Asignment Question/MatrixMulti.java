public class MatrixMulti {
    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrix2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        int[][] result = new int[3][3]; // Result matrix

        // Matrix multiplication
        for (int i = 0; i < 3; i++) {             // row of first matrix
            for (int j = 0; j < 3; j++) {         // column of second matrix
                for (int k = 0; k < 3; k++) {     // column of first matrix == row of second matrix
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Display result
        System.out.println("Multiplication of the two matrices is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
