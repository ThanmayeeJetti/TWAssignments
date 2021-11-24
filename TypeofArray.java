import java.util.Scanner;

public class TypeofArray {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = s.nextInt();

        int even = 0;
        int odd = 0;
        int mixed = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                even = even+1;

            }
        }

        for (int i = 0; i < n; i++) {
            if (a[i] %2 == 1) {
                odd = odd+1;
            }
        }

        if (even == n)
            System.out.println("even");
        if (odd == n)
            System.out.println("odd");
        if (even != 0 && odd != 0 && mixed == 0)
            System.out.println("mixed");

    }
}