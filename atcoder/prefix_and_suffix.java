package atcoder;

import java.util.Scanner;
public class prefix_and_suffix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String s = sc.next();
        String t = sc.next();
        sc.close();

        boolean isPrefix = m >= n && t.startsWith(s);
        boolean isSuffix = m >= n && t.endsWith(s);

        if (isPrefix && isSuffix) {
            System.out.println(0);
        } else if (isPrefix) {
            System.out.println(1);
        } else if (isSuffix) {
            System.out.println(2);
        } else {
            System.out.println(3);
        }
    }
}
