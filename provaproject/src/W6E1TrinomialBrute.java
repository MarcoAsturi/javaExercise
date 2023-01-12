public class W6E1TrinomialBrute {
    
    public static long trin(int n, int k) {
        if (n == 0 && k == 0) {
            return 1;
        } else if (k < - n || k > n ) {
            return 0;
        } else {
            return trin(n-1, k-1) + trin(n-1, k) + trin(n-1, k+1);
        }
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        System.out.println(trin(n,k));
    }
}
