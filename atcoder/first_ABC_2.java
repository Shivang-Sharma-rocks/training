package atcoder;

import java.util.Scanner;
public class first_ABC_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        sc.close();
        if(s.contains("ABC")){
            System.out.println(s.indexOf("ABC")+1);
        }else{
            System.out.println(-1);
        }
    }
}
