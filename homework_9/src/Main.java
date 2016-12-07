import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RepeatTheCalculation();
        Student ronWeasley = new Student("Ron", "Weasley", 24, Lang.RU, Faculty.GRYFFINDOR);

        Student harryPotter = new Student("Harry", "Potter", 25, Lang.EN);
        Student romildaWood = new Student("Romilda", "Wood", 30, Lang.EN);
        Student hermioneGranger = new Student("Hermione", "Granger", 23, Lang.EN);
        Student jainWeasley = new Student("Jain", "Weasley", 20, Lang.EN);
        Student fredWeasley = new Student("Fred", "Weasley", 27, Lang.EN);
        Student georgeWeasley = new Student("George", "Weasley", 27, Lang.EN);
        Student PercyWeasley = new Student("Percy", "Weasley", 23, Lang.EN);
        Student nevilleLongbottom = new Student("Neville", "Longbottom", 24, Lang.EN);
        Student lavenderBrown = new Student("Lavender", "Brown", 26, Lang.EN);
        Student seamusFinnigan = new Student("Seamus", "Finnigan", 25, Lang.EN);
        Student deanThomas = new Student("Dean", "Thomas", 24, Lang.EN);
        Student oliverWood = new Student("Oliver", "Wood", 23, Lang.EN);
        Student katieBell = new Student("Katie", "Bell", 22, Lang.EN);
        Student leeJordan = new Student("Lee", "Jordan", 23, Lang.EN);
        Student angelinaJohnson = new Student("Angelina", "Johnson", 24, Lang.EN);
        Student cormacMcLaggen = new Student("Cormac", "McLaggen", 25, Lang.EN);
        Student colinCreevey = new Student("Colin", "Creevey", 25, Lang.EN);
        Student romildaVane = new Student("Romilda", "Vane", 24, Lang.EN);
        Student dracoMalfoy = new Student("Draco", "Malfoy", 24, Lang.EN);
        Student vincentCrabbe = new Student("Vincent", "Crabbe", 23, Lang.EN);
        Student[] arrOfStudent = new Student[] {
                harryPotter, romildaWood, hermioneGranger, jainWeasley, fredWeasley, georgeWeasley, PercyWeasley,
                nevilleLongbottom, lavenderBrown, seamusFinnigan, deanThomas, oliverWood, katieBell, leeJordan,
                angelinaJohnson, cormacMcLaggen, colinCreevey, romildaVane, dracoMalfoy, vincentCrabbe
        };
        System.out.println("\n" + ronWeasley.toString() + "\n");
        Student[] SortedStudents = studentsAftrSortingHat(arrOfStudent);
        for (int i = 0; i < SortedStudents.length; i++) {
            System.out.println(SortedStudents[i].toString());
        }
    }
/*
5) Написать программу, которая случайным образом возвращает факультет в виде перечисления: GRYFFINDOR, SLYTHERIN, HUFFLEPUFF, RAVENCLAW.
* Использовать для выполнения метод nextInt(), который можно вызвать у экземпляра класса Random.
*/

    public static Faculty randomFaculty() {
        Random random = new Random();
        String faculties[] = Arrays.toString(Faculty.values()).split(", ");
        if (faculties[0].contains("[")) faculties[0] = faculties[0].replace("[", "");
        if (faculties[faculties.length-1].contains("]")) faculties[faculties.length-1] = faculties[faculties.length-1].replace("]", "");
        return Faculty.valueOf(faculties[random.nextInt(faculties.length)]);
    }
/*
6) Дан массив из 20 студентов. Определить к какому факультету в школе магии Хогвартс будет зачислен каждый из них.
Учесть то, что к каждому факультету может быть зачислено не более пяти новых студентов. Также факультеты могут быть определены только случайным образом.
*/
    public static Student studentGoesToFaculty(Student student, String faculty) {
        Student newStudent = new Student(student.firstName, student.lastName, student.years, student.lang, Faculty.valueOf(faculty));
        return newStudent;
    }

    public static Student[] studentsAftrSortingHat(Student[] arrOfStudent) {
        Student[] studentsAftrSortingHat = new Student[arrOfStudent.length];
        int g, s, h, r;
        g = s = h = r = 0;
        String faculty;
        for (int i = 0; i < arrOfStudent.length; i++) {
            while (true) {
                faculty = randomFaculty().toString();
                if (faculty.equals("GRYFFINDOR") && g < 5) break;
                else if (faculty.equals("SLYTHERIN") && s < 5) break;
                else if (faculty.equals("HUFFLEPUFF") && h < 5) break;
                else if (faculty.equals("RAVENCLAW") && r < 5) break;
            }
            if (faculty.equals("GRYFFINDOR")) {
                studentsAftrSortingHat[i] = studentGoesToFaculty(arrOfStudent[i], faculty);
                g++;
            }
            else if (faculty.equals("SLYTHERIN")) {
                studentsAftrSortingHat[i] = studentGoesToFaculty(arrOfStudent[i], faculty);
                s++;
            }
            else if (faculty.equals("HUFFLEPUFF")) {
                studentsAftrSortingHat[i] = studentGoesToFaculty(arrOfStudent[i], faculty);
                h++;
            }
            else if (faculty.equals("RAVENCLAW")) {
                studentsAftrSortingHat[i] = studentGoesToFaculty(arrOfStudent[i], faculty);
                r++;
            }
        }
        return studentsAftrSortingHat;
    }

    public static void defDataTypeAndExeCalc(Scanner scanner) {
        System.out.print("Enter the operator (+ - * /): ");
        String operator = scanner.next();
        System.out.print("Enter first operand: ");
        String a = scanner.next();
        System.out.print("Enter second operand: ");
        String b = scanner.next();
        double num1 = Double.parseDouble(a);
        double num2 = Double.parseDouble(b);
        double res = 0;
        switch (operator) {
            case "+": {
                res = Calc.sum(num1, num2);
                if ((res + "").endsWith(".0")) System.out.print((a + operator + b) + " = " + (int)res);
                else System.out.print((a + operator + b) + " = " + res);
                break;
            }
            case "-": {
                res = Calc.minus(num1, num2);
                if ((res + "").endsWith(".0")) System.out.print((a + operator + b) + " = " + (int)res);
                else System.out.print((a + operator + b) + " = " + res);
                break;
            }

            case "*": {
                res = Calc.multiply(num1, num2);
                if ((res + "").endsWith(".0")) System.out.print((a + operator + b) + " = " + (int)res);
                else System.out.print((a + operator + b) + " = " + res);
                break;
            }
            case "/": {
                res = Calc.division(num1, num2);
                if ((res + "").endsWith(".0")) System.out.print((a + operator + b) + " = " + (int)res);
                else System.out.print((a + operator + b) + " = " + res);
                break;
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
