import java.util.Scanner;

public class SpideyDistance {

    private static long gcd(long n, long d) {
        while (d > 0) {
            long t = n;
            n = d;
            d = t % d;
        }
        return n;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt(), s = sc.nextInt();

        long tp, sp;

        if (t <= s) {
            tp = 4 * t * (t + 1) / 2 + 1;
            sp = 4 * s * (s + 1) / 2 + 1;

            for (int i = 2; i < s; i += 3) {
                sp += (s - i) * 4;
            }

        } else {
            tp = 4 * s * (s + 1) / 2 + 1;
            t -= s;

            int i;
            for (i = 2; i < s && t > 0; i += 3) {
                tp += (s - i) * 4;
                t--;
            }

            sp = tp;

            for (; i < s; i += 3) {
                sp += (s - i) * 4;
            }
        }

        if (tp >= sp) {
            System.out.println(1);
        } else {
            long g = gcd(tp, sp);
            System.out.printf("%d/%d\n", tp / g, sp / g);
        }
    }
}
