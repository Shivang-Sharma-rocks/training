package june_10_2026;

import java.util.Scanner;
public class factorial {
    public static long recursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * recursive(n - 1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if(n < 0){
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }
        System.out.println(recursive(n));
    }
}
