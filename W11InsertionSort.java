// Insertion sort


public class W11InsertionSort {
    public static void sort(String[] a) {
        // Move down through the array
        int N = a.length;
        // Each item bubbles up above the larger ones above it
        // Everything above the current item is in order
        for (int i = 1; i < N; i++)
            // Everything below the current item is untouched
            for (int j = i; j > 0; j--)
                if (a[j - 1].compareTo(a[j]) > 0)
                    exch(a, j - 1, j); // See below
                else
                    break;
    }

    // Exchange method
    private static void exch(String[] a, int i, int j) {
        String t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void main(String[] args) {
        String[] a = {"Kim", "Jhon", "Tod", "Ann", "Bill", "Phil", "Bet"};
        sort(a);
        for (int i = 0; i < a.length; i++)
            StdOut.println(a[i]);
    }
}
