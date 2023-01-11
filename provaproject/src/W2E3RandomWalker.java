
//badly written, to redo...
public class W2E3RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        int s = 0;

        // if (Math.abs(x) + Math.abs(y) == r ) {
        // System.out.println("(" + x + "; " + y + ")");
        // System.out.println("steps = " + s);
        // } else {
        // if ((int) (Math.random() * 4) == 0) {
        // x++;
        // } else if ((int) (Math.random() * 4) == 1) {
        // x--;
        // } else if ((int) (Math.random() * 4) == 2) {
        // y++;;
        // } else if ((int) (Math.random() * 4) == 3) {
        // y--;
        // }
        // System.out.println("(" + x + "; " + y + ")");
        // s++;
        // }

        while (r != Math.abs(x) + Math.abs(y)) {
            if (Math.abs(x) + Math.abs(y) == r) {
                System.out.println("(" + x + "; " + y + ")");
                System.out.println("steps = " + s);
            } else {
                if ((int) (Math.random() * 4) == 0) {
                    x++;
                } else if ((int) (Math.random() * 4) == 1) {
                    x--;
                } else if ((int) (Math.random() * 4) == 2) {
                    y++;
                    ;
                } else if ((int) (Math.random() * 4) == 3) {
                    y--;
                }
                System.out.println("(" + x + "; " + y + ")");
                s++;
            }
        }
        System.out.println("(" + x + "; " + y + ")");
        System.out.println("steps = " + s);
    }
}
