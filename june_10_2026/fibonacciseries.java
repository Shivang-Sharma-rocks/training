package june_10_2026;

import java.util.Scanner;
public class fibonacciseries {
    public static int recursive(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return recursive(n - 1) + recursive(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 0; i < n; i++) {
            System.out.print(recursive(i));
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
