public class Main {

    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);

        CheckTheFormula checkTheFormula = new CheckTheFormula();
        checkTheFormula.searchForMissingParentheses(args[0], args[1]);
    }
}
