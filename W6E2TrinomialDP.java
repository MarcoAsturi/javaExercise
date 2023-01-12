public class W6E2TrinomialDP {
    //sbagliato, da rifare
    public static long trin(int n, int k) {
        if (n == 0 && k == 0) {
            return 1;
        } else if (k < -n || k > n) {
            return 0;
        } else {
            //numero colonne raddoppiato
            long[][] triangle = new long[n+1][2*n+1];
            triangle[0][0] = 1;
            //noto che T8n,k)=T(n,-k)
            for ( int i =  1 ; i <= n ; i++) {
                for (int j = 0; j <= i; j++) {
                    //procedimento copiato, da rifare
                    if (j == 0) {
                        triangle[i][j] = triangle[i-1][j] + 2 * triangle[i-1][j+1];
                    } else if (j==1) {
                        triangle[i][j] = triangle[i-1][j-1];
                    } else {
                        triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j] + triangle[i-1][j+1];
                    }
                }
            }
            return triangle[n][k];
        }
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        System.out.println(trin(n,k));
    }
}
