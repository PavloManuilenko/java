public class Main {
    public static void main(String[] args) {
        /*
        1. С некоторого момента прошло 234 дня. Сколько полных недель прошло за этот период?
        */
        short days = 234;
        int answer = days/7;
        System.out.println("\nFull weeks were passed: " + answer);
        /*
        2. Дан прямоугольник с размерами 543 * 130 мм. Сколько квадратов со стороной 130 мм можно отрезать от него?
        */
        short rectangleHeight = 543;
        int squareHeight = 130;
        System.out.println("\nPossible to cut : " + (rectangleHeight / squareHeight) + " squares");
        /*
        3. Дано двузначное число. Найти:
        а) число десятков в нем;
        б) число единиц в нем;
        в) сумму его цифр;
        г) произведение его цифр.
        */
        byte num1 = 56;
        int a = num1 - (num1 % 10);
        int b = num1 % 10;
        int c = (a / 10) + b;
        int d = (a / 10) * b;
        System.out.println("\nNumber: " + num1);
        System.out.println("Number of tens: " + a);
        System.out.println("Number of ones: " + b);
        System.out.println("Sum of numbers: " + c);
        System.out.println("Multiplication of numbers: " + d);
        /*
        4. Дано двузначное число. Получить число, образованное при перестановке цифр заданного числа.
        */
        byte num2 = 42;
        int firstNum = num2 % 10;
        int secondNum = (num2 - firstNum) / 10;
        System.out.println("\nNumber: " + num2);
        System.out.println("Reposition of numbers: " + firstNum + secondNum);
        /*
        5. Вычислить значение логического выражения при следующих значениях логических величин А, В и С: А = Истина, В = Ложь, С = Ложь:
        а) не А и В;
        б) А или не В;
        в) А и В или С.
        */
        boolean a1 = true;
        boolean b1 = false;
        boolean c1 = false;
        System.out.println("\nNot A and B: " + (!a1 && b1));
        System.out.println("A or not B: " + (a1 || !b1));
        System.out.println("A and B or C: " + ((a1 && b1) || c1));
        /*
        6. Вычислить значение логического выражения при следующих значениях логических величин X, Y и Z: X = Ложь, Y = Ложь, Z = Истина:
        а) X или Y и не Z;
        б) не X и не Y;
        в) не (X и Z) или Y;
        г) X и не Y или Z;
        д) X и (не Y или Z);
        е) X или (не (Y или Z)).
        */
        boolean x = false;
        boolean y = false;
        boolean z = true;
        System.out.println("\nX or Y and not Z: " + ((x || y) && !z));
        System.out.println("Not X and not Y: " + (!x && !y));
        System.out.println("Not (X and Z) or Y: " + (!(x && z) || y));
        System.out.println("X and not Y or Z: " + ((x && !y) || z));
        System.out.println("X and (not Y or Z): " + (x && (!y || z)));
        System.out.println("X or (not (Y or Z)): " + (x || (!(y || z))));
        /*
        7. Вычислить значение логического выражения:
        а) x2 + y2  при x=1, y=-1;
        б) (x  0) или (y24) при x = 1, y = 2;
        в) (x  0) и (y2 4) при x = 1, y = 2;
        г) (x * y 0) и (y > x) при x = 2, y = 1;
        д) (x * y 0) или (y < x) при x = 2, y = 1;
        е) (не(x * y < 0)) и (y > x) при x = 2, y = 1;
        ж) (не(x * y < 0)) или (y > x) при x = 1, y = 2.
        */
        byte x2 = 1;
        byte y2 = -1;
        //Task 1
        x2 *= x2;
        y2 *= y2;
        System.out.println("\nа: " + (x2 + y2 <= 4));
        //Task 2
        x2 = 1;
        y2 = 2;
        System.out.println("б) " + ((x2 >= 0) || ((y2 *= y2) != 4)));
        //Task 3
        System.out.println("в) " + ((x2 >= 0) && ((y2 *= y2) != 4)));
        //Task 4
        x2 = 2;
        y2 = 1;
        System.out.println("г) " + (((x2 * y2) != 0) && (y2 > x2)));
        //Task 5
        System.out.println("д) " + (((x2 * y2) != 0) || (x2 < y2)));
        //Task 6
        System.out.println("е) " + (!((x2 * y2) < 0) && (y2 > x2)));
        //Task 7
        x2 = 1;
        y2 = 2;
        System.out.println("ж) " + (!((x2 * y2) < 0) || (y2 > x2)));
    }
}
