import jdk.nashorn.internal.ir.IfNode;

public class Main {
    public static void main(String[] args){
        int[] arrOfNums = new int[] {1, 5, 10, 15, 20, 25, 50};
        int[] arrOfSameAndNumsDiff = new int[] {1, 2, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 8, 8, 9, 9, 10, 10, 11};
        int[] speedOfCars = new int[] {100, 220, 90 , 60, 140, 100, 110, 120, 160, 80, 140, 180, 200, 160, 180, 290, 250, 280, 130, 310, 100, 120, 90 , 60, 140, 100, 110, 120, 160, 80, 140, 180, 200, 160, 180, 290, 250, 280, 130, 310};
        int[] sequence = new int[] {100, 75, 50, 25, 0};
        double[] arrOfDoubNums = new double[] {-5.2, 5.2, 6.8, 7.1, 4.3};
        int num = 1000;
        System.out.println("<Task 1>\n" + avgOfLongIntArr(arrOfNums, false));
        System.out.println("\n<Task 2>\n" + avgOfLongIntArrM(arrOfNums, 20, false));
        System.out.println("\n<Task 3>\n" + sameAndDiffNumsInArr(arrOfSameAndNumsDiff));
        System.out.println("\n<Task 4>\n" + maxSpeedOf2Cars(speedOfCars));
        System.out.println("\n<Task 5>\n" + sumAndNumOfArr(sequence));
        System.out.println("\n<Task 6>\n");
        System.out.println("\n<Task 7>\nMax: " + lookingForMaxNnum(132233));
        //System.out.println("\n<Task 8>\nNum is: " + num + "mirror num is: " + mirrorNum(num));
        System.out.println("\n<Task 9>\n" + numberToWords(99));
        System.out.println("\n<Task 10>\n" + studentMark((byte) 100));

    }
//1. Найти среднее арифметическое элементов массива, больших числа 10. * Решить задачу при помощи циклов while и for-each
    public static int avgOfLongIntArr(int[] arr, boolean isUseWhile) { //while
        int sum = 0;
        int countOfValidElem = 0;
        if (!isUseWhile){
            for (int i : arr) {
                if (i > 10) {
                    sum += i;
                    countOfValidElem++;
                }
            }
            return  sum/countOfValidElem;
        }
        else {
            int i = 0;
            while (i < arr.length) {
                if (arr[i] > 10) {
                    sum += arr[i];
                    countOfValidElem++;
                }
                i++;
            }
            return  sum/countOfValidElem;
        }
    }
//2. Найти среднее арифметическое элементов массива, меньших некоторого числа m. * Решить задачу при помощи циклов while и for-each
    public static int avgOfLongIntArrM(int[] arr, int m, boolean isUseWhile) { //while
        int sum = 0;
        int countOfValidElem = 0;
        if (!isUseWhile){
            for (int i : arr) {
                if (i < m) {
                    sum += i;
                    countOfValidElem++;
                }
            }
            return  sum/countOfValidElem;
        }
        else {
            int i = 0;
            while (i < arr.length) {
                if (arr[i] < m) {
                    sum += arr[i];
                    countOfValidElem++;
                }
                i++;
            }
            return  sum/countOfValidElem;
        }
    }
//3. В массиве из 20 элементов числа образуют неубывающую последовательность. Несколько элементов, идущих подряд, равны между собой. Найти количество таких элементов. Сколько различных чисел имеется в массиве?
    public static String sameAndDiffNumsInArr(int[] arr) {
        String sameAndDiffNumsInArr = "";
        byte counter = 0;
        for (int i = 1; i < arr.length-1; i++) {
            if (arr[i] == arr[i-1]) {
                counter++;
            }
        }
        return sameAndDiffNumsInArr += "There are (" + counter + ") the same elements and (" + (arr.length - counter) + ") different elements in Array";
    }
//4. В массиве хранится информация о максимальной скорости каждой из 40 марок легковых автомобилей. Определить скорости двух самых быстрых автомобилей. * Задачу решить, не используя два прохода по массиву.
    public static String maxSpeedOf2Cars(int[] arr) {
        String maxSpeedOf2Cars = "The speed of the two fastest cars: ";
        int maxSpeedCar1 = 0;
        int maxSpeedCar2 = 0;
        if (arr[0] >= arr[1]) {
            maxSpeedCar1 = arr[0];
            maxSpeedCar2 = arr[1];
        }
        else {
            maxSpeedCar1 = arr[1];
            maxSpeedCar2 = arr[0];
        }
        for (int i = 2; i < arr.length-1; i++) {
            if (arr[i] >= maxSpeedCar1){
                maxSpeedCar2 = maxSpeedCar1;
                maxSpeedCar1 = arr[i];
            }
            else if (arr[i] < maxSpeedCar1 && arr[i] > maxSpeedCar2) maxSpeedCar2 = arr[i];
            else continue;
        }
        return maxSpeedOf2Cars += maxSpeedCar1 + " and " + maxSpeedCar2;
    }
//5. Дана непустая последовательность целых чисел, оканчивающаяся нулем. Найти: а) сумму всех чисел последовательности; б) количество всех чисел последовательности.
    public static String sumAndNumOfArr(int[] arr) {
        String sumAndNumOfArr = "The sum and number of all numbers in the sequence: ";
        int sum = 0;
        int count = 0;
        for (int i : arr) {
            sum += i;
            count++;
        }
        return sumAndNumOfArr += sum + " and " + count;
    }
//6. Дана последовательность из n вещественных чисел, начинающаяся с отрицательного числа. Определить, какое количество отрицательных чисел записано в начале последовательности. Условный оператор не использовать.

//7. Дано натуральное число. Определить, сколько раз в нем встречается максимальная цифра (например, для числа 132233 ответ равен 3, для числа 46 336 — 2, для числа 12 345 — 1). * Задачу решить, не используя два прохода по массиву.
    public static int lookingForMaxNnum(int num) {
        int lookingForMaxNnum = 0;
        int maxNew = 0;
        int maxOld = num%10;
        while (num > 0) {
            maxNew = num%10;
            num /= 10;
            if (maxNew > maxOld) {
                lookingForMaxNnum = 1;
                maxOld = maxNew;
            }
            else if (maxOld == maxNew) lookingForMaxNnum++;
        }
        return lookingForMaxNnum;
    }
//8. Дано число. Написать программу, которая возвращает его зеркальное отражение в виде числа.
    /*public static int mirrorNum(int num) {
        int mirrorNum = 0;
        String temp = null;
        while (num < 0) {
            temp += num%10;
            num /= 10;
        }
        return mirrorNum = Integer.valueOf(temp);
    }*/
//9. Дано двузначное число. Необходимо написать программу, которая вернет строковое представление данного числа. Например, дано число 34, его строковое представление - thirty four.
    public static String numberToWords(int num) {
        String numberToWords = "Wrong number [waiting for a two-digit number]";
        int lastNum = 0;
        if (num <= 19) {
            switch (num) {
                case 10: numberToWords = "Ten"; break;
                case 11: numberToWords = "Eleven"; break;
                case 12: numberToWords = "Twelve"; break;
                case 13: numberToWords = "Thirteen"; break;
                case 14: numberToWords = "Fourteen"; break;
                case 15: numberToWords = "Fifteen"; break;
                case 16: numberToWords = "Sixteen"; break;
                case 17: numberToWords = "Seventeen"; break;
                case 18: numberToWords = "Eighteen"; break;
                case 19: numberToWords = "Nineteen"; break;
            }
        }
        else {
            lastNum = num % 10;
            num -= lastNum;
            switch (num) {
                case 20: numberToWords = "Twenty"; break;
                case 30: numberToWords = "Thirty"; break;
                case 40: numberToWords = "Forty"; break;
                case 50: numberToWords = "Fifty"; break;
                case 60: numberToWords = "Sixty"; break;
                case 70: numberToWords = "Seventy"; break;
                case 80: numberToWords = "Eighty"; break;
                case 90: numberToWords = "Ninety"; break;
            }
            if (lastNum > 0) {
                switch (lastNum) {
                    case 1: numberToWords += "-one"; break;
                    case 2: numberToWords += "-two"; break;
                    case 3: numberToWords += "-three"; break;
                    case 4: numberToWords += "-four"; break;
                    case 5: numberToWords += "-five"; break;
                    case 6: numberToWords += "-six"; break;
                    case 7: numberToWords += "-seven"; break;
                    case 8: numberToWords += "-eight"; break;
                    case 9: numberToWords += "-nine"; break;
                }
            }
            else return numberToWords;
        }
        return numberToWords;
    }
//10. Написать программу определения оценки студента по его рейтингу, на основе следующих правил: 0-19=F | 20-39=E | 40-59=D | 60-74=C | 75-89=B | 90-100=A
    public static char studentMark(byte rating) {
        char studentMark = ' ';
        if (rating >= 0 && rating <= 19) return studentMark = 'F';
        else if (rating >= 20 && rating <= 39) return studentMark = 'E';
        else if (rating >= 40 && rating <= 59) return studentMark = 'D';
        else if (rating >= 60 && rating <= 74) return studentMark = 'C';
        else if (rating >= 75 && rating <= 89) return studentMark = 'B';
        else if (rating >= 90 && rating <= 100) return studentMark = 'A';
        else return studentMark;
    }
}