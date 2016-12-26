/*
Список заказов (массив объектов. У каждого объекта есть название заказанного напитка и его количество)
*/
public class Order {
    int orderNumber;
    String nameOfDrink;
    int countOfItem;

    public Order(int orderNumber, String nameOfDrink, int countOfItem) {
        this.orderNumber = orderNumber;
        this.nameOfDrink = nameOfDrink;
        this.countOfItem = countOfItem;
    }

    @Override
    public String toString() {
        String toString = "Order number: " + orderNumber + ", name of drink: " + nameOfDrink + ", count of item: " + countOfItem;
        return toString;
    }

    @Override
    public boolean equals(Object obj) {
        if (null == obj) return false;
        if (this == obj) return true;
        if (obj instanceof Order) {
            Order order = (Order) obj;
            if (this.nameOfDrink != null && order.nameOfDrink != null) {
                boolean equals = order.nameOfDrink.equals(((Order) obj).nameOfDrink);
                if (equals) {
                    equals = order.countOfItem == ((Order) obj).countOfItem;
                    if (equals) {
                        return order.orderNumber == ((Order) obj).orderNumber;
                    }
                }
            }
        }
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash += this.nameOfDrink.hashCode();
        hash *= this.countOfItem;
        hash *= this.orderNumber;
        return hash;
    }
}