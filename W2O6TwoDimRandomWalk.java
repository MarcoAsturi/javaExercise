// A two-dimensional random walk simulates the behavior of a particle moving in a grid of points.
// At each step, the random walker moves north, south, east, or west with probability equal to 1/4,
// independent of previous moves.
// Write a program RandomWalker that takes an integer command-line argument n and estimates
// how long it will take a random walker to hit the boundary of a 2n-by-2n square centered
// at the starting point.

public class W2O6TwoDimRandomWalk {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int step = 0;
        // starting point (x, y)
        int x = 0;
        int y = 0;
        // random walk
        while (true) {
            double rand = Math.random();
            if (rand < 0.25) {
                x++;
                if (x == (2 * n)) {
                    break;
                }
            } else if (rand < 0.50) {
                x--;
                if (x == (-2 * n)) {
                    break;
                }
            } else if (rand < 0.75) {
                y++;
                if (y == (2 * n)) {
                    break;
                }
            } else {
                y--;
                if (y == (-2 * n)) {
                    break;
                }
            }
            step++;
        }
        System.out.println(step);
    }
}
