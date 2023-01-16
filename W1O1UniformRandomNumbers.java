public class W1O1UniformRandomNumbers {
    public static void main(String[] args) {
        // prints five uniform random numbers between 0 and 1
        double a = Math.random();
        double b = Math.random();
        double c = Math.random();
        double d = Math.random();
        double e = Math.random();
        System.out.println(a + " " + b + " " + c + " " + d + " " + e);
        // average value
        double avg = (a + b + c + d + e) / 5;
        System.out.println("average = " + avg);
        // minimum and maximum values (without using cycle)
        double maxab = Math.max(a, b);
        double maxcd = Math.max(c, d);
        double maxabcd = Math.max(maxab, maxcd);
        double max = Math.max(maxabcd, e);
        System.out.println("maximum = " + max);

        double minab = Math.min(a, b);
        double mincd = Math.min(c, d);
        double minabcd = Math.min(minab, mincd);
        double min = Math.min(minabcd, e);
        System.out.println("minimum = " + min);
    }
}
