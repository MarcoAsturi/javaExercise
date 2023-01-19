// Binary search
// Works only with arrays in sorted order

public class W11BinarySearch {

    // set minimum and maximum index
    public static int search(String key, String[] a) {
        return search(key, a, 0, a.length);
    }

    // Examine the middle key
    public static int search(String key, String[] a, int lo, int hi) {
        if (hi <= lo)
            return -1;
        int mid = lo + (hi - lo) / 2;
        int cmp = a[mid].compareTo(key);
        // If it is larger, search the half with lower indices
        if (cmp > 0)
            return search(key, a, lo, mid);
        // If it is smaller, search the half with upper indices
        else if (cmp < 0)
            return search(key, a, mid + 1, hi);
        // If it matches, return its index
        else
            return mid;
    }

    // Main returns key's index
    public static void main(String[] args) {
        String key = "Jim";
        String[] a = {"Ann", "Bob", "Dol", "Jack", "Jim", "Morg", "Phil"};
        System.out.println(search(key, a));
    }
}
