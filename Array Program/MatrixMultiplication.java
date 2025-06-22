import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        int[][] C = new int[3][3]; // Resultant matrix

        // Input matrix A
        System.out.println("Enter elements of first 3x3 matrix (A):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                A[i][j] = sc.nextInt();
            }
        }

        // Input matrix B
        System.out.println("Enter elements of second 3x3 matrix (B):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                B[i][j] = sc.nextInt();
            }
        }

        // Multiply matrices: C = A x B
        for (int i = 0; i < 3; i++) { // row of A
            for (int j = 0; j < 3; j++) { // column of B
                C[i][j] = 0;
                for (int k = 0; k < 3; k++) { // dot product
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Display result matrix
        System.out.println("Resultant Matrix (A x B):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
