package atcoder;

import java.util.Scanner;
public class seats_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(n/2 >=m && n%2==0){
            System.out.println("Yes");
        }else if(n/2+1 >=m && n%2==1){
            System.out.println("Yes");
        } 
        else {
            System.out.println("No");
        }
        sc.close();
    }
}
