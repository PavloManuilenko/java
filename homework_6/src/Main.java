import java.util.Arrays;

public class Main {
    public static void main(String[] arg) {
        //1. Дано слово. Добавить к нему в начале и конце столько звездочек, сколько букв в этом слове.
        System.out.println("<Task 1>\n" + addStarsToStr("Test"));
        //2. Дано название футбольного клуба. Напечатать его на экране "столбиком".
        System.out.println("\n<Task 2>\n" + switchStrLineToColumn("Dnipro"));
        //3. Найти сумму положительных нечетных чисел, меньших 50.
        System.out.println("<Task 3>\n" + sumOfPositiveOddNum(50));
        /*4. Вася открыл счет в банке 1 марта, вложив 1000 грн. Через каждый месяц размер вклада увеличивается на 2% от имеющейся суммы. Определить:
        а) прирост суммы вклада за каждый месяц с 1-го марта до конца года;
        б) сумму вклада через: полгода, 2 года, 5 лет.*/
        float[] eachMonthIncVasyaDeposit = eachMonthIncDeposit((byte) 3, 1000, 0.02F);
        System.out.println("\n<Task 4>\na) " + Arrays.toString(eachMonthIncVasyaDeposit));
        System.out.println("b.1) half year: " + amountOfDepositAfterInsPer(1000, 6, 0.02F));
        System.out.println("b.2) two years: " + amountOfDepositAfterInsPer(1000, 24, 0.02F));
        System.out.println("b.3) five years: " + amountOfDepositAfterInsPer(1000, 60, 0.02F));
        //5. Определить, войдет ли в конверт с внутренними размерами a и b мм прямоугольная открытка размером с и d мм. Для размещения открытки в конверте необходим зазор в 1 мм с каждой стороны.
        int envSideA = 120;
        int envSideB = 80;
        int cardSideC = 118;
        int cardSideD = 78;
        System.out.println("\n<Task 5>\nCard " + cardSideC + "x" + cardSideD + " fits to the envelope " + envSideA + "x" + envSideB + ": " + giftCardSize(envSideA, envSideB, cardSideC, cardSideD));
        //6. Даны два различных вещественных числа. Определить наибольшее из них применив один неполный условный оператор.
        float numOne = 50.2F;
        float numTwo = 50.3F;
        System.out.println("\n<Task 6>\nWhich number is bigger " + numOne + " or " + numTwo + "? - " + whichNumBigger(numOne, numTwo) + " is bigger");
        /*7. Записать условие, которое является истинным, когда:
        a) только одно из чисел А и В четное;
        б) хотя бы одно из чисел А и В положительно;*/
        System.out.println("\n<Task 7>\na) " + compareNumA(5, 5));
        System.out.println("b) " + compareNumB(-1, 2));
        //8. Напечатать таблицу соответствия между весом в фунтах и весом в килограммах для значений 1, 2, ..., 10 фунтов (1 фунт = 453 г).
        System.out.println("\n<Task 8>\n" + poundsToKg());
        //9. Напечатать таблицу перевода 1, 2, ... 20 долларов США в гривны по текущему курсу (значение курса вводится с клавиатуры).
        double curEx = 27.1;
        System.out.println("\n<Task 9>\n" + usdToUah(curEx));
        //10. Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить, сколько клеток будет через 3, 6, 9, ..., 24 часа, если первоначально была одна амеба.
        System.out.println("\n<Task 10>\nSouce amoeba = 1 celled:\n" + amoeba());
        //11. В массиве записаны оценки по информатике 22 учеников класса. Определить количество учеников, оценка которых меньше средней оценки по классу, и вывести номера элементов массива, соответствующих таким ученикам.
        int[] marksOfcompScience = new int[]{5, 5, 4, 3, 2, 4, 5, 3, 3, 4, 5, 4, 3, 2, 4, 5, 3, 3, 4, 5, 2, 4};
        System.out.println("<Task 11>\n" + compScience(marksOfcompScience));
        //12. Дан массив целых чисел. Определить количество четных элементов и количество элементов, оканчивающихся на цифру 5.
        int[] arrInt = new int[]{1995, 25, 34, 36, 25, 14};
        int[] ans = checkEleOfArr(arrInt);
        System.out.println("\n<Task 12>\nNumber of even element: " + ans[0] + "\nThe number of items ending in the number 5: " + ans[1]);
    }

    public static String addStarsToStr(String sourceStr) {
        String addStarsToStr = "";
        for (int i = 0; i <= (sourceStr.length() * 2); i++) {
            addStarsToStr += (i == sourceStr.length()) ? sourceStr : "*";
        }
        return addStarsToStr;
    }

    public static String switchStrLineToColumn(String sourceStr) {
        String switchStrLineToColumn = "";
        for (int i = 0; i < sourceStr.length(); i++) {
            switchStrLineToColumn += sourceStr.charAt(i) + "\n";
        }
        return switchStrLineToColumn;
    }

    public static int sumOfPositiveOddNum(int num) {
        int sumOfPositiveOddNum = 0;
        for (int i = 1; i < num; i++) {
            if ((i % 2) > 0) sumOfPositiveOddNum += i;
            else continue;
        }
        return sumOfPositiveOddNum;
    }

    public static float[] eachMonthIncDeposit(byte currentMonth, int amount, float rate) {
        final byte YEAR = 12;
        float[] eachMonthIncDeposit = new float[YEAR - currentMonth];
        eachMonthIncDeposit[0] = 0;
        for (int i = 1; i < (YEAR - currentMonth); i++) {
            eachMonthIncDeposit[i] = ((amount + eachMonthIncDeposit[i-1]) * rate);
        }
        return eachMonthIncDeposit;
    }

    public static float amountOfDepositAfterInsPer(int amount, int periodInMonth, float rate) {
        float amountOfDepositAfterInsPer = amount;
        for (int i = 1; i < periodInMonth; i++) {
            amountOfDepositAfterInsPer += (amountOfDepositAfterInsPer * rate);
        }
        return amountOfDepositAfterInsPer;
    }

    public static boolean giftCardSize(int envelopeInsSideA, int envelopeInsSideB, int giftCardSideA, int giftCardSideB) {
        int rotateTheCard = 0;
        if (giftCardSideB > giftCardSideA) {
            rotateTheCard = giftCardSideA;
            giftCardSideA = giftCardSideB;
            giftCardSideB = rotateTheCard;
        }
        if (((envelopeInsSideA - 2) >= giftCardSideA) && ((envelopeInsSideB - 2) >= giftCardSideB)) return true;
        else return false;
    }


    public static float whichNumBigger(float numOne, float numTwo) {
        float whichNumBigger = numOne;
        if (numOne < numTwo) whichNumBigger = numTwo;
        return whichNumBigger;
    }

    public static boolean compareNumA(int numOne, int numTwo) {
        if (((numOne % 2) == 0)^((numTwo % 2) == 0)) return true;
        else return false;
    }

    public static boolean compareNumB(int numOne, int numTwo) {
        if ((numOne > 0) || (numTwo > 0)) return true;
        else return false;
    }

    public static String poundsToKg() {
        String poundsToKg = "";
        for (int i = 1; i < 10; i++) {
            poundsToKg += "Pound(s): " + i + " = " + i * 0.453 + " kilogram(s)\n";
        }
        return poundsToKg;
    }

    public static String usdToUah(double curExchangeRates) {
        String usdToUah = "";
        for (int i = 1; i < 10; i++) {
            usdToUah += "USD: " + i + " = " + i * curExchangeRates + " UAH\n";
        }
        return usdToUah;
    }

    public static String amoeba() {
        String amoeba = "";
        for (int i = 3, celled = 2; i <= 24; celled *= 2, i += 3) {
            amoeba += "after " + i + " hours = " + celled + " celled\n";
        }
        return amoeba;
    }

    public static String compScience(int[] arrOfMarks) {
        String compScience = "Number of array elements: ";
        int average = 0;
        int sumOfDumbPupil = 0;
        for (int i = 0; i < arrOfMarks.length; i++) {
            average += arrOfMarks[i];
        }
        average /= arrOfMarks.length;
        for (int i = 0; i < arrOfMarks.length; i++) {
            if (arrOfMarks[i] < average) {
                sumOfDumbPupil += 1;
                compScience += i + ", ";
            }
        }
        compScience += "number of pupil who has mark less than the average: " + sumOfDumbPupil;
        return compScience;
    }

    public static int[] checkEleOfArr(int[] sourceArr) {
        int[] checkEleOfArr = new int[]{0, 0};
        for (int i = 0; i < sourceArr.length; i++) {
            if (sourceArr[i] % 2 == 0) checkEleOfArr[0] += 1;
            else checkEleOfArr[0] += 0;
            if (sourceArr[i] % 10 == 5) checkEleOfArr[1] += 1;
            else checkEleOfArr[1] += 0;
        }
        return checkEleOfArr;
    }
}