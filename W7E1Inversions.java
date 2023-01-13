import java.util.Arrays;

public class W7E1Inversions {

    // return the number of inversion in the permutation a[]
    // given an array of integers, a pair of elements a[i] and a[j]
    // are inverted if i < j and a[i] > a[j]
    public static long count(int[] a) {
        long count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length; j++) {
                if (i < j && a[i] > a[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    // Return a permutation of length n with exactly k inversions.
    public static int[] generate(int n, long k) {

        // creating array of length n
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        // permutation cycle (CAN'T WORK IF k >= n)
        for (int i = 1; i <= k; i++) {
            int temp = arr[n - i];
            arr[n - i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
        return arr;
    }

    // Takes an integer n and a long k as command-line arguments,
    // and prints a permutation of length n with exactly k inversions.
    public static void main(String[] args) {
        // test count method
        // int[] a = {7, 1, 2, 4, 3, 6, 5};
        // System.out.println(count(a));

        // test generate method
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        System.out.println(Arrays.toString(generate(n, k)));
        System.out.println(count(generate(n, k)));
    }
}
