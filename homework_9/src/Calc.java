public class Calc {
    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static double sum(double a, double b) {
        double sum = a + b;
        return sum;
    }

    public static int sum(String a, String b) {
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);
        int sum = x + y;
        return (int) sum;
    }

    public static int minus(int a, int b) {
        int minus = 0;
        if (a > b) minus = a - b;
        else minus = b - a;
        return minus;
    }

    public static double minus(double a, double b) {
        double minus = 0;
        if (a > b) minus = a - b;
        else minus = b - a;
        return minus;
    }

    public static int division(int a, int b) {
        int division = 0;
        if (a > b) division = a / b;
        else division = b / a;
        return division;
    }

    public static double division(double a, double b) {
        double division = 0;
        if (a > b) division = a / b;
        else division = b / a;
        return division;
    }

    public static int multiply(int a, int b) {
        int multiply = a * b;
        return multiply;
    }

    public static double multiply(double a, double b) {
        double multiply = a * b;
        return multiply;
    }

}