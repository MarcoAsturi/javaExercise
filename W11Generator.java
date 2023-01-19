// Generate N random strings of length L from a given alphabet

public class W11Generator {

    // method to create a random string with "alpha" chars
    public static String randomString(int L, String alpha) {
        char[] a = new char[L];
        for (int i = 0; i < L; i++) {
            // The StdRandom class provides static methods for generating 
            // random number from various discrete and continuous distributions
            // .inufomrInt returns a random integer uniformly in [0, n)
            int t = StdRandom.uniformInt(alpha.length());
            a[i] = alpha.charAt(t);
        }
        return new String(a);
    }

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int L = Integer.parseInt(args[1]);
        String alpha = args[2];
        for (int i = 0; i < N; i++)
            StdOut.println(randomString(L, alpha));
    }
}
