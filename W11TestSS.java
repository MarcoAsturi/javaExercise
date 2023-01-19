// Print time required for 10N searches in a whitelist of length N

public class W11TestSS {
    // searching a key word in a string
    // returns the index of the word in the array or return -1 otherwise
    public static int search(String key, String[] a) {
        for (int i = 0; i < a.length; i++)
            if (a[i].compareTo(key) == 0)
                return i;
        return -1;
    }

    // java command for testing W11Generator : 
    // java Generator 10000 10 a-z | java TestSS
    // BUT DOESN'T WORK (problems with Standars Libraries)
    
    public static void main(String[] args) {
        String[] words = StdIn.readAllStrings();
        int N = words.length;
        // keep tracking time
        double start = System.currentTimeMillis() / 1000.0;
        for (int i = 0; i < 10 * N; i++) {
            String key = words[StdRandom.uniformInt(N)];
            if (search(key, words) == -1)
                StdOut.println(key);
        }
        double now = System.currentTimeMillis() / 1000.0;
        StdOut.println(Math.round(now - start) + " seconds");
    }
}
