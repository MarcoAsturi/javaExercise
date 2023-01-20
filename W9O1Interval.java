// An interval is defined to be the set of all points on the line
// greater than or equal to left and less than or equal to right.
// In particular, an interval with right less than left is empty.
// Write a client that is a filter that takes a floating-point command-line argument x
// and prints all of the intervals on standard input
// (each defined by a pair of double values) that contain x.

public class W9O1Interval {

    // instance variables
    private double a;
    private double b;

    // constructor
    public W9O1Interval(double left, double right) {
        a = left;
        b = right;
    }

    // is x in this interval?
    public boolean contains(double x) {
        if (x >= a && x <= b) {
            return true;
        } else {
            return false;
        }
    }

    // do this interval and that intersect?
    public boolean intersects(W9O1Interval that) {
        if (this.contains(that.a) || this.contains(that.b)) {
            return true;
        } else {
            return false;
        }
    }

    // string representation
    public String toString() {
        return "[ " + a + " , " + b + " ]";
    }

    // test
    public static void main(String[] args) {
        System.out.println("------");
        
        double a1 = 1.0;
        double b1 = 6.0;
        W9O1Interval inter1 = new W9O1Interval(a1, b1);
        System.out.println("inter 1 : " + inter1.toString());
        System.out.println("------");

        double x = 5.0;
        System.out.println("contans " + x + " : " + inter1.contains(x));
        System.out.println("------");

        double a2 = 4.0;
        double b2 = 6.0;
        W9O1Interval inter2 = new W9O1Interval(a2, b2);
        System.out.println("inter 2 : " + inter2.toString());
        System.out.println("------");

        System.out.println("inter 1 intersects inter 2 : " + inter1.intersects(inter2));
        System.out.println("------");

        double a3 = 7.0;
        double b3 = 16.0;
        W9O1Interval inter3 = new W9O1Interval(a3, b3);
        System.out.println("inter 2 : " + inter3.toString());
        System.out.println("------");

        System.out.println("inter 1 intersects inter 3 : " + inter1.intersects(inter3));
        System.out.println("------");
    }
}
