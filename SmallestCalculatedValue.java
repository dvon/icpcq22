import java.util.Scanner;

public class SmallestCalculatedValue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 4; i++) {
            if (i == 3 && a % b != 0) continue;
            int ab = i == 0 ? a + b :
                     i == 1 ? a - b :
                     i == 2 ? a * b : a / b;

            for (int j = 0; j < 4; j++) {
                if (j == 3 && ab % c != 0) continue;
                int abc = j == 0 ? ab + c :
                          j == 1 ? ab - c :
                          j == 2 ? ab * c : ab / c;

                if (abc >= 0 && abc < min) min = abc;
            }
        }

        System.out.println(min);
    }
}