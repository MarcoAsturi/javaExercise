public class W7E1Inversoins {

    // return the number of inversion in the permutation a[]
    public static long count(int[] a) {
        long count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length; j++) {
                if (i < j && a[i] > a[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    // public static int[] generate(int n, long k) {

    // }

    public static void main(String[] args) {
        //test count method
        int[] a = {7, 1, 2, 4, 3, 6, 5};
        System.out.println(count(a));
    }
}
