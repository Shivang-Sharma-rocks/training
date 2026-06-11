package june_10_2026;

import java.util.Scanner;
public class Backtracking {
    public static void backtrack(int index, int n, int s[]) {
        if (index == n) {
            for (int i = 0; i < n; i++) {
                System.out.print(s[i]);
            }
            System.out.println();
            return;
        }
        for (int c = 0; c < 26; c++) {
            s[index] = c;
            backtrack(index + 1, n, s);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] path = new int[n];
        for (int i = 0; i < n; i++) {
            path[i] = sc.nextInt();
        }
        sc.close();
        backtrack(0, n, path);
    }
}
