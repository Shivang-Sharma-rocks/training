import java.util.Scanner;

public class sum_int {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int sum = 0;
        int rem = 0;

        while(n > 0){
            rem = n % 10;
            sum += rem;
            n /= 10;
        }

        if(sum % 5==0 && sum % 6 ==0){
            System.out.println("YES");
        }else if(sum % 5 == 0 ){
            System.out.println("NO");
        }else if(sum % 6 == 0){
            System.out.println("MAYBE");
        }
        else{
            System.out.println("INVALID");
        }
        sc.close();
    }
}
