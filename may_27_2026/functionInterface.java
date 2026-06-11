package may_27_2026;

@FunctionalInterface
interface calculator {
    int operate(int a, int b);
}
public class functionInterface {
    public static void main(String[] args) {
        calculator add = (a, b) -> a + b;
        calculator subtract = (a, b) -> a - b;
        calculator multiply = (a, b) -> a * b;
        calculator divide = (a, b) -> a/b;

        int num1 = 10;
        int num2 = 5;

        System.out.println("Addition: " + add.operate(num1, num2));
        System.out.println("Subtraction: " + subtract.operate(num1, num2));
        System.out.println("Multiplication: " + multiply.operate(num1, num2));
        try {
            System.out.println("Division: " + divide.operate(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }

}
