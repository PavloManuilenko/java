import java.util.Random;
import java.util.Scanner;
import java.lang.Integer;

public class Main {
    public static void main(String[] args) {
        //RepeatTheCalculation();
        Student RonWeasley = new Student("Ron", "Weasley", 24, Lang.EN, Faculty.GRYFFINDOR);
        System.out.println(RonWeasley.toString());

    }

    public static Faculty randomFaculty() {
        Random random = new Random();
        //return Faculty.valueOf(random.nextInt());
        //random.nextInt(Faculty.values());
    }

    public static void defDataTypeAndExeCalc(Scanner scanner) {
        System.out.print("Enter the operator (+ - * /): ");
        String operator = scanner.next();
        System.out.print("Enter first operand: ");
        String a = scanner.next();
        System.out.print("Enter second operand: ");
        String b = scanner.next();

        if ((a.indexOf(".") > 0) || (b.indexOf(".") > 0 )) {
            double num1 = Double.parseDouble(a);
            double num2 = Double.parseDouble(b);
            switch (operator) {
                case "+": System.out.print((a + operator + b) + " = " + Calc.sum(num1, num2)); break;
                case "-": System.out.print((a + operator + b) + " = " + Calc.minus(num1, num2)); break;
                case "*": System.out.print((a + operator + b) + " = " + Calc.multiply(num1, num2)); break;
                case "/": System.out.print((a + operator + b) + " = " + Calc.division(num1, num2)); break;
            }
        }
        else {
            int num1 = Integer.parseInt(a);
            int num2 = Integer.parseInt(b);
            switch (operator) {
                case "+": System.out.print((a + operator + b) + " = " + Calc.sum(num1, num2)); break;
                case "-": System.out.print((a + operator + b) + " = " + Calc.minus(num1, num2)); break;
                case "*": System.out.print((a + operator + b) + " = " + Calc.multiply(num1, num2)); break;
                case "/": System.out.print((a + operator + b) + " = " + Calc.division(num1, num2)); break;
            }
        }
    }

    public static void RepeatTheCalculation() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            defDataTypeAndExeCalc(scanner);
            System.out.print("\nRepeat the calculation? (y/n)");
            String exitWord = scanner.next();
            if (exitWord != null && exitWord.length() > 0 && !exitWord.equalsIgnoreCase("y")) break;
        }
    }

}
