/*
У официантов есть два метода: взять заказ и взять чаевые
- Метод “взять заказ” добавляет элемент в массив заказов бара. При этом, официант должен предупредить клиента,
если в баре недостаточное количество напитка, чтобы выполнить заказ.
- Метод “взять чаевые” добавляет количество чаевых в общую сумму на баре.
- Для каждого класса переопределить методы equals(), hashCode() и toString().
*/
public class Waiter extends Employee {

    public Waiter(String name, byte years, Bar bar) throws NotExistBarException {
        super(name, years, bar);
    }

    public String takeOrder(String nameOfDrink, int countOfItem) {
        String takeOrder = new String();
        if (bar.volumeOfOrders <= 0) {
            return takeOrder = "Sorry, we can't accept a new order, please wait for a while.";
        } else if (countOfItem <= 0) {
            return takeOrder = "Sorry, but order like this is impossible to order.";
        } else {
            takeOrder = bar.makeOrder(nameOfDrink, countOfItem);
        }
        return takeOrder;
    }

    public void takeTips(int tips) {
        bar.addTips(tips);
    }

    @Override
    public String toString() {
        String toString = "Name: " + name + ", years old: " + years;
        return toString;
    }

    @Override
    public boolean equals(Object obj) {
        if (null == obj) return false;
        if (this == obj) return true;
        if (obj instanceof Waiter) {
            Waiter waiter = (Waiter) obj;
            if (this.name != null && waiter.name != null) {
                boolean equals = waiter.name.equals(((Waiter) obj).name);
                if (equals) {
                    return waiter.years == ((Waiter) obj).years;
                }
            }
        }
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash += this.name.hashCode();
        hash *= this.years;
        return hash;
    }

}