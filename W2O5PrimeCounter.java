// Write a program PrimeCounter that takes an integer command-line argument n
// and finds the number of primes less than or equal to n.

// IT DOESNT WORK

public class W2O5PrimeCounter {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int count = 1;
        for (int i = 2; i <= n; i++) {
            // checking from i to n the prime numbers
            for (int j = 1; j <= i; j++) {
                int div = 0;
                if (i % j == 0) {
                    div++;
                }
                if (div == 2) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
