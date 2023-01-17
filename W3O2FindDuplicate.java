import java.util.Arrays;

// Given an integer array of length n, with each value between 1 and n,
// write a code fragment to determine whether there are any duplicate values.
// You may not use an extra array (but you do not need to preserve the contents of the given array.)

public class W3O2FindDuplicate {
    // method to create the array
    public static int[] arr(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * (n + 1));
        }
        return arr;
    }

    // method to check duplicated values
    public static boolean anyDuplicate(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[i] == arr[i + j]) {
                    count++;
                    break;
                }
            }
        }
        if (count != 0) {
            return true;
        } else {
            return false;
        }
    }

    // takes an integer command-line argument n to create array and find any duplicated values
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] arr = arr(n);
        System.out.println(Arrays.toString(arr));
        System.out.println(anyDuplicate(arr));
        int[] prova = {1, 2, 3, 4}; // false
        System.out.println(anyDuplicate(prova));
        int[] prova2 = {1, 2, 3, 4, 4}; // true
        System.out.println(anyDuplicate(prova2));
        int[] prova3 = {1, 2, 3, 4, 5, 3}; // true
        System.out.println(anyDuplicate(prova3));
    }
}
