// Write a data type Point that implements the following API:

public class W9O2Point {

    // instance variables
    public double x;
    public double y;

    // constructor
    public W9O2Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Euclidean distance between this point and q
    // d(P, Q) = sqrt[(Xp - Xq)^2 + (Yp - Yq)^2]
    public double distanceTo(W9O2Point q) {
        return Math.sqrt(Math.pow((this.x - q.x), 2) + Math.pow((this.y - q.y), 2));
    }

    // string representation
    public String toString() {
        return "( " + x + " , " + y + " )2";
    }

    // test
    public static void main(String[] args) {
        System.out.println("------");

        W9O2Point P = new W9O2Point(1, 1);
        System.out.println("point P : " + P.toString());
        W9O2Point Q = new W9O2Point(4, 5);
        System.out.println("point Q : " + Q.toString());
        System.out.println("------");

        System.out.println("distance between P and Q : " + P.distanceTo(Q));
        System.out.println("------");
    }
}
