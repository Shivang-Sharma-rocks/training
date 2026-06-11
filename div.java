import java.util.Scanner;

public class div {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        
        if (x%3==0 && x%5==0) {
            System.out.println("FizzBuzz");
        } else if (x%3==0) {
            System.out.println("Fizz");
        } else if (x%5==0) {
            System.out.println("Buzz");
        } else {
            System.out.println("Number");
        }
        sc.close();
    }
}
