package june_8_2026;

import java.util.Scanner;
public class PrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<q;i++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            int sum = 0;
            for(int j = l; j <= r; j++) {
                sum += arr[j];
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
