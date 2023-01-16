public class W1O2ThreeSort {
    // Write a program that takes three integer command-line arguments
    // and prints them in ascending order. Use Math.min() and Math.max().
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int minab = Math.min(a, b);
        int min = Math.min(minab, c);
        int maxab = Math.max(a, b);
        int max = Math.max(maxab, c);
        int medium = a + b + c - min - max;
        System.out.println(min);
        System.out.println(medium);
        System.out.println(max);
    }
}
