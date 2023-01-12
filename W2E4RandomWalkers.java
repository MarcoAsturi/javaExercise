

public class W2E4RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int t = Integer.parseInt(args[1]);
        int x = 0;
        int y = 0;
        int s = 0;
        double sum = 0;

        for (int i = 0 ; i < t ; i++ ) {
            while (r != Math.abs(x) + Math.abs(y)) {
                if (Math.abs(x) + Math.abs(y) != r) {
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
                    s++;
                }
            }
            sum = sum + s;
        }
        double medium = sum / t;
        System.out.println("average number of steps = " + medium);
    }
}
