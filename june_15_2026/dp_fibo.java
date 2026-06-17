package june_15_2026;

import java.util.Scanner;
public class dp_fibo {
    public int helper(int n, int dp[]){
        if(n==0) return 1;
        if(n<0) return 0;

        if(dp[n] !=-1) return dp[n];

        return dp[n]= helper(n-2,dp)+helper(n-1,dp);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        sc.close();
        int dp[]= new int[n+1];
        for(int i=0;i<=n;i++) dp[i]=-1;
        dp_fibo obj = new dp_fibo();
        System.out.println(obj.helper(n,dp));
    }
}
