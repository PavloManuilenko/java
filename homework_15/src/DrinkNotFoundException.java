/*
В случае если указанный напиток не был найден в запасах бара необходимо создать исключение DrinkNotFoundException.
При этом исключение должно информировать об отсутсвии заданного напитка. Пример: Requested drink: Fanta is not found
*/
public class DrinkNotFoundException extends Exception {
    public DrinkNotFoundException(String message) {
        System.out.println(message);
    }
}