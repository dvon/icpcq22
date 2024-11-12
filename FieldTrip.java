import java.util.Scanner;

public class FieldTrip {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] a = sc.nextLine().toCharArray();
        char[] b = sc.nextLine().toCharArray();

        for (int i = 0, j = 0; i < a.length || j < b.length; ) {
            if (j >= b.length || (i < a.length && a[i] <= b[j])) { 
                System.out.print(a[i++]);
            } else {
                System.out.print(b[j++]);
            }
        }

        System.out.println();
    }
}