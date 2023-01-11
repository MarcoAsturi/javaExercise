public class W5E1ActivationFunction {
    public static double hs(double x) {
        double h = Double.NaN;
        if (x < 0) {
            h = 0.0;
        } else if (x == 0) {
            h = 0.5;
        } else {
            h = 1.0;
        }
        return h;
    }

    public static double sig(double x) {
        return 1 / (1 + Math.exp(-x));
    }

    public static double tan(double x) {
        return ((Math.exp(x) - Math.exp(-x)) / (Math.exp(x) + Math.exp(-x)));
    }

    public static double ss(double x) {
        return x / (1 + Math.abs(x));
    }

    public static double sqnl(double x) {
        double s = Double.NaN;
        if (x <= -2) {
            s = -1;
        } else if (x > -2 && x < 0) {
            s = x + x*x/4;
        } else if (x > 0 && x < 2) {
            s = x - x*x/4;
        } else {
            s = 1;
        }
        return s;
    }

    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        System.out.println(hs(x));
        System.out.println(sig(x));
        System.out.println(tan(x));
        System.out.println(ss(x));
        System.out.println(sqnl(x));
    }
}
