

public class W2E2BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int w = Integer.parseInt(args[1]);

        for( int i = 0 ; i < n ; i++) {
            if ( i <= w ) {
                System.out.print("* ");
            } else {
                System.out.print("0 ");
            }
        }
    }
}
