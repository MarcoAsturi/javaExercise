import java.util.Arrays;

// Write a code fragment to multiply two rectangular matrices that are not necessarily square.
// Note: For the dot product to be well defined, the number of columns in the first matrix
// must be equal to the number of rows in the second matrix.
// Print an error message if the dimensions do not satisfy this condition.

public class W3O1MatrixMultiplicator {
    // method to create random n-by-m matrix of integers from 1 to 9
    public static int[][] matrix(int n, int m) {
        int[][] matrix = new int[n][m];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        return matrix;
    }

    // method to multiply 2 matrices
    public static int[][] matrixProduct(int[][] matrix1, int[][] matrix2) {
        int[][] matrixProduct = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrixProduct.length; i++) {
            for (int j = 0; j < matrixProduct[i].length; j++) {
                for (int k = 0; k < matrixProduct.length; k++) {
                    matrixProduct[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return matrixProduct;
    }
    /// Takes integer command-line arguments for numbers of row and col of matrix 1
    // and row and col of matrix 2
    public static void main(String[] args) {
        // creates and prints 2 matrices
        int n1 = Integer.parseInt(args[0]);
        int m1 = Integer.parseInt(args[1]);
        int[][] matrix1 = matrix(n1, m1);
        int n2 = Integer.parseInt(args[2]);
        int m2 = Integer.parseInt(args[3]);
        int[][] matrix2 = matrix(n2, m2);
        System.out.println("MATRIX 1 :");
        for (int i = 0; i < matrix1.length; i++) {
            System.out.println(Arrays.toString(matrix1[i]));
        }
        System.out.println("MATRIX 2 :");
        for (int i = 0; i < matrix2.length; i++) {
            System.out.println(Arrays.toString(matrix2[i]));
        }

        // check and application
        if (matrix1[0].length != matrix2.length) {
            System.out.println(
                    "ERROR: the number of columns in the first matrix must be equal to the number of rows in the second matrix");
        } else {
            int[][] matrixProduct = matrixProduct(matrix1, matrix2);
            // prints result
            System.out.println("PRODUCT :");
            for (int i = 0; i < matrixProduct.length; i++) {
                System.out.println(Arrays.toString(matrixProduct[i]));
            }
        }
    }
}
