import java.util.Arrays;

public class Main {
    public static void main (String[] args){
        //1. Вывести на экран возрастающую последовательность из 10 чисел начиная с 15.
        System.out.println("<Task 1>");
        for (int i = 15; i <= 25; i++){
            System.out.println("Number: " + i);
        }
        //2. Вывести на экран убывающую последовательность нечетных чисел в интервале от 33 до 15.
        System.out.println("\n<Task 2>");
        for (int i = 33; i >= 15; i-=2){
            System.out.println("Number: " + i);
        }
        //3. Написать программу для вывода на экран всех элементов массива строк через запятую.
        String[] arrForTask3 = new String[] {"A", "B", "C", "D", "F"};
        String toArr = arrStrToStr(arrForTask3);
        System.out.println("\n<Task 3>\nArray: " + toArr);
        //4. Написать программу для вывода на экран всех элементов массива чисел в обратном порядке.
        int[] arrForTask4 = new int[] {1, 2, 3, 4, 5};
        System.out.println("\n<Task 4>");
        for (int i = (arrForTask4.length-1); i >= 0; i--){
            System.out.println(arrForTask4[i]);
        }
        //5. Написать программу для заполнения 20 элементов массива чисел с шагом 3, первым элементом которого будет 5.
        int[] arrForTask5 = new int[20];
        arrForTask5 = fillTheArr(5, 3, arrForTask5);
        for (int i = 0; i < arrForTask5.length; i++){
        }
        //6. Написать программу для заполнения массива чисел из 10 элементов значениями переменной а, при условии что а является членом арифметической прогрессии 2а-1, а1=4.
        System.out.println("\n<Task 6>");
        int[] arrForTask6 = progress(4);
        for (int i = 0; i < arrForTask6.length; i++){
            System.out.println(arrForTask6[i]);
        }
        //7. Выяснить, верно ли, что сумма элементов массива есть неотрицательное число, используя тернарный оператор.
        int[] arrForTask7 = new int[] {1, 2, -3, -4, 5};
        System.out.println("\n<Task 7>" + posOrNeg(arrForTask7));
        /*8. Дан массив чисел. Используя тернарный оператор определить:
        а) максимальный элемент;
        б) минимальный элемент;
        в) на сколько максимальный элемент больше минимального;
        г) индекс максимального элемента;
        д) индекс минимального и индекс максимального элементов.*/
        int[] arrForTask8 = new int[] {15, 4, 30, 54, 5};
        String[] task8 = task8(arrForTask8);
        System.out.println("\n<Task 8>\n" + task8[0] + "\n" + task8[1] + "\n" + task8[2] + "\n" + task8[3] + "\n" + task8[4]);
    }

    public static String arrStrToStr (String[] arrForTask3){
        String toArr = "";
        for (int i = 0; i < arrForTask3.length; i++){
            toArr += arrForTask3[i];
            toArr = (i <= arrForTask3.length-2) ? (toArr = toArr + ", ") : (toArr = toArr + ".");
        }
        return toArr;
    }
    public static int[] fillTheArr (int start, int step, int[] arrForTask5){
        int j = start;
        for (int i = 0; i < arrForTask5.length; i++){
            arrForTask5[i] = j;
            j+=step;
        }
        return arrForTask5;
    }
    public static int[] progress(int firstNum){
        int[] arrForTask6 = new int[10];
        for (int a = firstNum, i = 0; i < arrForTask6.length; a = 2*a-1, i++) {
            arrForTask6[i] = a;
        }
        return arrForTask6;
    }
    public static String posOrNeg (int[] arrForTask7){
        int sum = 0;
        for (int i = 0; i < arrForTask7.length; i++){
            sum += arrForTask7[i];
        }
        boolean ansForTask7 = sum > 0;
        return ("\nSum of array-elements is positive?: " + ansForTask7);
    }
    public static String[] task8 (int[] arrForTask8){
        String[] ans = new String[5];
        int max = arrForTask8[0];
        int min = arrForTask8[0];
        for (int i = 1; i < arrForTask8.length; i++){
            max = (max < arrForTask8[i]) ? (max = arrForTask8[i]) : (max = max);
            min = (min > arrForTask8[i]) ? (min = arrForTask8[i]) : (min = min);
        }
        for (int i = 0; i < arrForTask8.length; i++){
            ans[3] = (max == arrForTask8[i]) ? ("index of max: [" + i + "]") : (ans[3] = ans[3]);
        }
        for (int i = 0; i < arrForTask8.length; i++){
            ans[4] = (min == arrForTask8[i]) ? (ans[3] + " and index of min: [" + i + "]") : (ans[4] = ans[4]);
        }
        ans[0] = "max: " + max;
        ans[1] = "min: " + min;
        ans[2] = "max - min: " + (max-min);
        return ans;
    }
}