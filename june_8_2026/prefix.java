package june_8_2026;

import java.util.Scanner;

public class prefix {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] pref = new int[n];
        pref[0] = arr[0];
        for(int i = 1; i < n; i++) {
            pref[i] = pref[i-1] + arr[i];
        }

        for(int i=0;i<q;i++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            l -= 1;
            r -= 1;
            int sum = pref[r]-pref[l-1];
            
            System.out.println(sum);
        }
        sc.close();
    }
}
