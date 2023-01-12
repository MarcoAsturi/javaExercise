public class W5E2Divisors {

    public static int gcd(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        int div = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                div = i;
            }
        }
        return div;
    }

    public static int lcm(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        int mul = Math.max(a, b);
        while (mul % Math.min(a, b) != 0) {
            mul = mul + Math.max(a, b);
        }
        return mul;
    }

    public static boolean areRelPrime(int a, int b) {
        if (a == 0 || b == 0) {
            return false;
        }
        int div = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                div = i;
            }
        }
        if (div == 1) {
            return false;
        } else {
            return true;
        }   
    }

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        System.out.println(gcd(x,y));
        System.out.println(lcm(x,y));
        System.out.println(areRelPrime(x,y));
    }
}
