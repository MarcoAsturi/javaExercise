import java.util.Arrays;

// DA FINIRE
public class W7E3MaximumSquareSubmatrix {

    // Creates a random n-by-b matrix of 0s and 1s
    public static int[][] matrix(int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // NOT ARBITRARY METHOD
                if (Math.random() < 0.25) {
                    matrix[i][j] = 0;
                } else {
                    matrix[i][j] = 1;
                }
            }
        }
        return matrix;
    }

    // Returns the size of the largest contiguous square submatrix
    // of a[][] containing only 1s.
    public static int size(int[][] a) {
        int size = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                // if (a[i][j] == 1) {
                //     size = 1;
                    for (int k = 0; k < a.length - j && k < a.length - i; k++) {
                        int count = 0;
                        if (a[i][j + k] == 1 && a[i + k][j] == 1 && a[i + k][j + k] == 1) {
                            count ++;
                        } else {
                            return count;
                        }
                        size = count;
                    }
                // }
            }
        }
        return size;
    }

    // Reads an n-by-n matrix of 0s and 1s from standard input
    // and prints the size of the largest contiguous square submatrix
    // containing only 1s.
    public static void main(String[] args) {
        // tests print matrix
        int n = Integer.parseUnsignedInt(args[0]);
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(matrix(n)[i]));
        }

        // size method
        System.out.println(size(matrix(n)));
    }
}
