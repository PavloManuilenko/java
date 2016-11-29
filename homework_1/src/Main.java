public class Main {
    public static void main(String[] args) {
        int numb = 10;

        int parity = numb % 2;
        String answer = (parity == 0) ? ("Number is parity!") : ("Number NOT is parity.");

        System.out.println(answer);
    }
}
