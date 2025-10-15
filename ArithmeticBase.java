package arithmetic;

import java.util.Scanner;

public class ArithmeticBase {

    public double calculate(double x, double y) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter arithmetic operation to perform (plus, minus, times, divide): ");
        String input = sc.nextLine();

        try {
            Operation op = Operation.from(input);
            double result = op.apply(x, y);
            System.out.println("Result: " + result);
            return result;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return 0;
        }
    }

    public static void main(String[] args) {
        ArithmeticBase calc = new ArithmeticBase();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        calc.calculate(a, b);
    }
}
