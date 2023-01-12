

public class W1E2RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        //without using conditional
        boolean positive = a > 0 && b > 0 && c > 0;
        boolean square = a*a == b*b + c*c || b*b == a*a + c*c || c*c == b*b + a*a;
        boolean rightTriangle = positive && square;
        System.out.println(rightTriangle);
    }
}
