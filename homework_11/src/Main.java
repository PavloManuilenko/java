public class Main {
    public static void main (String[] args){
        System.out.println("<Task 1>\nDays in month: " + daysOfMonth((byte) 2, args));
        System.out.println("\n<Task 2>\nCard is: " + whichCard((byte)1, (byte)12));
        System.out.println("\n<Task 3>\na) day is: " + whatDayOfWeek(15));
        System.out.println("b) day is: " + whatDayOfWeekStartWith((byte)5, 15));
        System.out.println("\n<Task 4>\nNum is: " + numToWord((byte)10));
        System.out.println("\n<Task 5>\nNum is: Reversed string: " + newStrReverse("Test of string"));
        System.out.println("\n<Task 6>\n" + validatorOfEmailAddress("Test1@google.com"));
        String[] arr = new String[]{"Alex", "Mark", "Alex", "Paul", "Alex", "Alex", "Paul", "Mark", "Paul"};
        System.out.println("\n<Task 7>\na) " + strArrToLineA(arr));
        System.out.println("b) " + strArrToLineB(arr));

    }
    /*1. Составить программу, которая в зависимости от порядкового номера месяца (1, 2, ..., 12) выводит на экран количество дней в этом месяце. Рассмотреть два случая:
    1) год не является високосным;
    2) год может быть високосным (информация об этом вводится в аргументы при запуске программы).*/
    public static byte daysOfMonth(byte numOfMonth, String[] args){
        boolean isLeapYear = Boolean.valueOf(args[0]);
        //byte daysOfMonth;
        switch (numOfMonth){
            case 1: return 31;
            case 2: if (isLeapYear) return 29; else return 28;
            case 3: return 31;
            case 4: return 30;
            case 5: return 31;
            case 6: return 30;
            case 7: return 31;
            case 8: return 31;
            case 9: return 30;
            case 10: return 31;
            case 11: return 30;
            case 12: return 31;
            default: return 0;
        }
    }
    /*Мастям игральных карт условно присвоены следующие порядковые номера: масти "пики" — 1, масти "трефы" — 2, масти "бубны" — 3, масти "червы" — 4,
    а достоинству карт: "валету" — 11, "даме" — 12, "королю" — 13, "тузу" — 14 (порядковые номера карт остальных достоинств соответствуют их названиям: "шестерка", "девятка" и т. п.).
    По заданным номеру масти m (1 <= m <=  4) и номеру достоинства карты k (6 <= k <= 14) определить полное название (масть и достоинство) соответствующей карты в виде "Дама пик", "Шестерка бубен" и т. п.*/
    public static String whichCard(byte m, byte k){
        String whichCard = "";
        switch (k){
            case 6: whichCard += "Six of "; break;
            case 7: whichCard += "Seven of "; break;
            case 8: whichCard += "Eight of "; break;
            case 9: whichCard += "Nine of "; break;
            case 10: whichCard += "Ten of "; break;
            case 11: whichCard += "Jack of "; break;
            case 12: whichCard += "Queen of "; break;
            case 13: whichCard += "King of "; break;
            case 14: whichCard += "Ace of "; break;
            default: whichCard += "[Can't recognize tne number] "; break;
        }
        switch (m){
            case 1: whichCard += "spades"; return whichCard;
            case 2: whichCard += "clubs"; return whichCard;
            case 3: whichCard += "diamonds"; return whichCard;
            case 4: whichCard += "hearts"; return whichCard;
            default: whichCard += "[Can't recognize the suit]"; return whichCard;
        }
    }
    /*3. Дано целое число k (1 <= k <= 365). Определить, каким днем недели (понедельником, вторником, ..., субботой или воскресеньем) является k-й день невисокосного года, в котором 1 января:
    а) понедельник;
    б) i-й день недели (если 1 января - понедельник, то d=1 , если вторник - d=2, ..., если воскресенье - d= 7).*/
    public static String whatDayOfWeek(int k){
        String whatDayOfWeek = "";
        while (k > 7) {
            k -= 7;
        }
        switch (k){
            case 1: whatDayOfWeek += "Monday"; break;
            case 2: whatDayOfWeek += "Tuesday"; break;
            case 3: whatDayOfWeek += "Wednesday"; break;
            case 4: whatDayOfWeek += "Thursday"; break;
            case 5: whatDayOfWeek += "Friday"; break;
            case 6: whatDayOfWeek += "Saturday"; break;
            case 7: whatDayOfWeek += "Sunday"; break;
            default:  whatDayOfWeek += "can't recognize (it should be from 1 to 365)"; break;
        }
        return whatDayOfWeek;
    }

    public static String whatDayOfWeekStartWith(byte dayStart, int k){
        String whatDayOfWeek = "";
        k += dayStart-1;
        while (k > 7) {
            k -= 7;
        }
        switch (k){
            case 1: whatDayOfWeek += "Monday"; break;
            case 2: whatDayOfWeek += "Tuesday"; break;
            case 3: whatDayOfWeek += "Wednesday"; break;
            case 4: whatDayOfWeek += "Thursday"; break;
            case 5: whatDayOfWeek += "Friday"; break;
            case 6: whatDayOfWeek += "Saturday"; break;
            case 7: whatDayOfWeek += "Sunday"; break;
            default:  whatDayOfWeek += "can't recognize (it should be from 1 to 365)"; break;
        }
        return whatDayOfWeek;
    }
    //4. Напишите программу для перевода чисел от 1 до 10 в строковое значение. Например, для числа 1 результатом будет строка “one”.//5. Дана строка. Написать программу, которая возвращает строку, написанную в обратном порядке.
    public static String numToWord(byte nume){
        String numToWord = "";
        switch (nume){
            case 1: numToWord = "One"; return numToWord;
            case 2: numToWord = "Two"; return numToWord;
            case 3: numToWord = "Three"; return numToWord;
            case 4: numToWord = "Four"; return numToWord;
            case 5: numToWord = "Five"; return numToWord;
            case 6: numToWord = "Six"; return numToWord;
            case 7: numToWord = "Seven"; return numToWord;
            case 8: numToWord = "Eight"; return numToWord;
            case 9: numToWord = "Nine"; return numToWord;
            case 10: numToWord = "Ten"; return numToWord;
            default: numToWord = "[Can't recognize entered number]"; return numToWord;
        }
    }
    //5. Дана строка. Написать программу, которая возвращает строку, написанную в обратном порядке.
    public static String newStrReverse(String str){
        StringBuilder builder = new StringBuilder();
        char[] strArr = str.toCharArray();
        for (int i = str.length()-1; i >= 0; i--){
            builder.append(strArr[i]);
        }
        String newStrReverse = builder.toString();
        return newStrReverse;
    }
    /*6. Дан email в виде строки. Написать программу для проверки email на валидность. email должен соответствовать условию (пример - emailaddr@domain.zone)
    1) emailaddr > 4 символов
    2) 1 < domain < 10
    3) 2 <= zone < 5
    При любом несовпадении с условием выводим в консоль сообщение с указанием на конкретную ошибку.*/
    public static String validatorOfEmailAddress(String email){
        String validatorOfEmailAddress = "";
        String emailaddr = email.substring(0, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@")+1, email.indexOf("."));
        String zone = email.substring(email.indexOf(".")+1, email.length());
        if (emailaddr.length() <= 4) return validatorOfEmailAddress = "Incorrect address before '@', please check and retry. ";
        else if (domain.length() < 1 || domain.length() > 10) return validatorOfEmailAddress = "Incorrect domain, please check and retry. ";
        else if (zone.length() <= 1 || zone.length() > 5) return validatorOfEmailAddress = "Incorrect zone, please check and retry. ";
        else return validatorOfEmailAddress = "The email address is correct";
    }
    /*7. Дан массив строк. Написать программу, которая:
    а) выводит на экран значение всех строк через запятую, длина которых больше n.
    б) выводит на экран значение всех неповторяющихся строк через запятую.*/
    public static String strArrToLineA(String[] steArr){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < steArr.length; i++){
            builder.append(steArr[i]);
            if (i < steArr.length-1) builder.append(", ");
        }
        String strArrToLine = builder.toString();
        return strArrToLine;
    }

    public static String strArrToLineB(String[] steArr){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < steArr.length; i++){
            for (int j = 0; j < steArr.length; j++){
                if (i != j && steArr[i].compareTo(steArr[j]) == 0) steArr[j] = "";
            }
            builder.append(steArr[i]);
            if (i < steArr.length-1 && steArr[i].compareTo("") != 0) builder.append(", ");
        }
        String strArrToLine = builder.toString();
        if (strArrToLine.endsWith(", ")) return strArrToLine.substring(0, strArrToLine.length()-2);
        else return strArrToLine;
    }
}