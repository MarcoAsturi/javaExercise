public class W6Quiz2 {
    public static int Q2(int n) {
        if (n <= 0) return 1;
        return 1 + Q2(n-2) + Q2(n-3);
    }

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println(Q2(x));
    }
}
