import java.util.Arrays;
// DA RIVEDERE ULTIMA PARTE

// takes an integer command-line argument m, followed by a sequence of
// positive integer command-line arguments a1,a2,…,an,
// and prints m random indices
// choosing each index i with probability proportional to ai
public class W3E1DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);

        // creates first array (a1,...,an)
        int[] a = new int[args.length - 1];
        for (int j = 0; j < a.length; j++) {
            a[j] = Integer.parseInt(args[j + 1]);
        }

        System.out.println(Arrays.toString(a));

        // To generate a random index i with probability proportional to ai:
        // Define the cumulative sums Si=a1+a2+…+ai, with S0=0
        // creates an array of cumulative sums (S1,...,Sn)
        int[] s = new int[a.length + 1];
        for (int j = 0; j < s.length; j++) {
            if (j == 0) {
                s[j] = 0;
            } else {
                s[j] = s[j - 1] + a[j - 1];
            }
        }

        System.out.println(Arrays.toString(s));

        // Picks a random integer r uniformly between 0 and Sn−1
        // int r = (int)(Math.random() * s[s.length]);

        // generate a random number and stores in random[]
        int[] random = new int[m];
        for (int j = 0; j < m; j++) {
            random[j] = (int) (Math.random() * s[s.length - 1]);
        }

        System.out.println(Arrays.toString(random));

        // PROBABLY USELESS
        // creates array of possible value of i
        // int[] index = new int[a.length];
        // for (int j = 0; j < a.length; j++) {
        // index[j] = j + 1;
        // }

        // Finds the unique index i between 1 and n such that Si−1 ≤ r < Si
        // creates the last array of length m and arguments i
        int[] result = new int[m];
        for (int j = 0; j < m; j++) {
            if (random[j] >= s[j] && random[j] < s[j + 1]) {
                result[j] = j + 1;
            }
        }

        System.out.println(Arrays.toString(result));
    }
}
