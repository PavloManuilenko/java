/*
Метод составление заказа должен проверять, достаточно ли на складе указанного напитка, и если нет
- то выбросить исключение OrderDrinkOverException.
При этом исключение должно информировать о недостаточном запасе напитка с указанием номера заказа и названия напитка.
Пример: Not correct value for order: 7. Requested drink: Apple juice is over.
*/
public class OrderDrinkOverException extends Exception {

    public OrderDrinkOverException(String message) {
        System.out.println(message);
    }
}
