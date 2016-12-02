import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the operator (+ - * /): ");
            String operator = scanner.next();

            System.out.print("Enter first operand: ");
            int a = scanner.nextInt();

            System.out.print("Enter second operand: ");
            int b = scanner.nextInt();

            switch (operator) {
                case "+":
                    System.out.print((a + operator + b) + " = " + Calc.sum(a, b));
                    break;
            }
            System.out.print("\nRepeat the calculation? (y/n)");
            String exitWord = scanner.next();
            if (exitWord != null && exitWord.length() > 0 && !exitWord.equalsIgnoreCase("y")) break;
        }
    }
}
