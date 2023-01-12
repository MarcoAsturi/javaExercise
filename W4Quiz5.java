

public class W4Quiz5 {
    public static void main(String[] args) {
        while (!StdIn.isEmpty()) {
            int x = StdIn.readInt();
            if (!StdIn.isEmpty())
                x += StdIn.readInt();
            StdOut.print(x + " ");
        }
        StdOut.println();
    }
}
