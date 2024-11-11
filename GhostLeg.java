import java.util.Scanner;

public class GhostLeg {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] rungs = new int[m];
        for (int i = 0; i < m; i++) rungs[i] = sc.nextInt();

        int[] perm = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            int j = i;

            for (int k = 0; k < m; k++) {
                if (rungs[k] == j) {
                    j++;
                } else if (rungs[k] == j - 1) {
                    j--;
                }
            }

            perm[j] = i;
        }

        for (int i = 1; i <= n; i++) {
            System.out.println(perm[i]);
        }
    }
}