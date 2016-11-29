package exercise1;
import java.util.Arrays;

public class Main {
    //Method for task 5
    public static String task5 (byte indexOfArr, String[] arrForTask5){
        return arrForTask5[indexOfArr];
    }
    //Method for task 8
    public static boolean[] task8 (byte s, byte k, byte[] arrForTask8){
        boolean[] arr = new boolean[3];
        int parity = arrForTask8[k] % 2;
        arr[0] = arrForTask8[s] > 0;
        arr[1] = parity == 0;
        arr[2] = arrForTask8[s] > arrForTask8[k];
        return arr;
    }
    //Method for task 9 and 10
    public static String[] taskForTwoDimensionalArr (byte a, byte b, byte c, byte d, String[][] twoDimArr){
        String[] arr = new String[2];
        arr[0] = twoDimArr[a][b];
        arr[1] = twoDimArr[c][d];
        return arr;
    }
    //Method for task 11
    public static String[] task11 (byte anyElemFromColumn, byte anyElemFromLine, String[][] twoDimArr){
        String[] arr = new String[2];
        arr[0] = twoDimArr[1][anyElemFromColumn];
        arr[1] = twoDimArr[anyElemFromLine][anyElemFromColumn];
        return arr;
    }
    public static void main (String[] args){
       //Task 1
        int[] arr = new int[] {};
       //Task 2
        byte[] byteArray = new byte[26];
       //Task 3
        String[] stringArray = new String[10];
       //Task 4
        String[] daysOfWeek = new String[] {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
       //Task 5
        String anyArrayElem;
        byte index = 4;
        anyArrayElem = task5(index, daysOfWeek);
        System.out.println("5) the value of array-element number " + index + " is \""  + anyArrayElem + "\"");
       //Task 6
        byte[] arrTask6 = new byte[] {37, 0, 50, 46, 34, 46, 0, 13};
       //Task 7
        byte[] arrTask7b = Arrays.copyOf(arrTask6, arrTask6.length);
        Arrays.sort(arrTask7b);
        byte[] arrTask7a = new byte[8];
        int j = (arrTask7b.length - 1);
        for (int i = 0; i < arrTask7b.length; i++){
            arrTask7a[i] = arrTask7b[j];
            j--;
        }
        System.out.println("\n7.a) decreasing sequence: " + (Arrays.toString(arrTask7a)));
        System.out.println("7.b) increasing sequence: " + (Arrays.toString(arrTask7b)));
       //Task 8
        byte s = 3;
        byte k = 7;
        boolean[] ansForTask8 = task8(s, k, arrTask6);
        System.out.println("\n8.a) array-element [" + arrTask6[s] + "] is positive? - \"" + ansForTask8[0] + "\"");
        System.out.println("8.b) array-element [" + arrTask6[k] + "] is parity?  - \"" + ansForTask8[1] + "\"");
        String maxOfArrEm = (ansForTask8[2]) ? ("8.c) array-element [" + arrTask6[s] + "] is bigger than [" + arrTask6[k] + "]") : ("8.c) array-element [" + arrTask6[k] + "] is bigger than [" + arrTask6[s] + "]");
        System.out.println(maxOfArrEm);
       //Task 9
        String[][] twoDimensionalArr = {{"A", "B"}, {"C", "D"}, {"E", "F"}};
        String[] ansForTask9 = taskForTwoDimensionalArr((byte) 0, (byte) 1, (byte) 2, (byte) 0, twoDimensionalArr);
        System.out.println("\n9.a) element which located in the upper right corner of matrix: [" + ansForTask9[0] + "]");
        System.out.println("9.b) element which located in the bottom left corner of matrix: [" + ansForTask9[1] + "]");
       //Task 10
        String[] ansForTask10 = taskForTwoDimensionalArr((byte) 2, (byte) 1, (byte) 0, (byte) 0, twoDimensionalArr);
        System.out.println("\n10.a) element which located in the bottom right corner of matrix: [" + ansForTask10[0] + "]");
        System.out.println("10.b) element which located in the upper left corner of matrix: [" + ansForTask10[1] + "]");
      //Task 11
        String[] ansForTask11 = task11((byte) 1, (byte)2, twoDimensionalArr);
        System.out.println("\n11.a) Any element from second line of matrix: [" + ansForTask11[0] + "]");
        System.out.println("11.b) Any element of matrix: [" + ansForTask11[1] + "]");
    }
}