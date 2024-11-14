import java.util.Scanner;

public class Metronome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf("%.2f\n", n / 4.0);
    }
}
