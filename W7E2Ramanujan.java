public class W7E2Ramanujan {

    // takes a long integer command-line argument n
    // and prints true if it is a Ramanujan number, and false otherwise
    // An integer n is a Ramanujan number if can be expressed
    // as the sum of two positive cubes in TWO different ways
    // For example 1729 = 1^3 + 12^3 = 9^3 + 10^3
    public static boolean isRamanujan(long n) {
        int count = 0;
        for (int i = 1; i < n - 1; i++) {
            if (Math.cbrt(i) == (int) Math.cbrt(i) && Math.cbrt(n - i) == (int) Math.cbrt(n - i)) {
                count++;
            }
        }
        if (count >= 2) {
            return true;
        } else {
            return false;
        }
    }

    // Takes a long integer command-line arguments n and prints true if
    // n is a Ramanujan number, and false otherwise.
    // some exaple that should return true: 1729, 4104, 216125
    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        System.out.println(isRamanujan(n));
    }
}
