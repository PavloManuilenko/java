/*
Есть некий бар, в котором работает некоторое количество барменов и официантов.
Нужно описать этот бар и его сотрудников, используя знания о наследовании, объектах и массивах.

О баре нам известно его название, а также обновляемые свойства:
- массив барменов
- массив официантов
- количество напитков, каждого вида (массив объектов. не более 5 элементов, для примера. Каждый элемент - это напиток.
  Свойства этого элемента - название, количество единиц этого напитка. Единицы измерения можно сделать какими угодно - литры, килограммы, бутылки)
- количество собранных официантами чаевых
- список заказов (массив объектов. У каждого объекта есть название заказанного напитка и его количество)

У бара есть методы:
- пополнить склад
- разделить чаевые
- добавить сотрудника
- уволить сотрудника

- Метод “пополнить склад” принимает объект с названием напитка и его количеством. Если такой напиток существует в баре,
то его количество обновляется. Если нет, то добавляется новый объект.
- Чаевые делятся на всех сотрудников бара.
- Метод “добавить сотрудника” принимает имя, возраст и должность сотрудника. Добавляет сотрудника в правильный массив в баре.
- Метод “уволить сотрудника” принимает имя и должность сотрудника. Убирает элемент выбранного сотрудника из правильного массива.

- Для каждого класса переопределить методы equals(), hashCode() и toString().
*/
public class Bar {
    String name = new String();
    Barmen[] barmen = new Barmen[10];
    Waiter[] waiters = new Waiter[20];
    static Drink[] drinks = new Drink[5];
    static Order[] orders = new Order[3];
    static int tips = 0;
    static int volumeOfOrders = orders.length;
    static int storageFreeSpace = drinks.length;
    private int tipsForEach = 0;
    private int countOfBarmen = barmen.length;
    private int countOfWaiters = waiters.length;

    public void addToStorage(Drink drink) {
        if (null != drink) {
            for (int i = 0; i < drinks.length; i++) {
                if (null != drinks[i]) {
                    if (drinks[i].nameOfDrink.equals(drink.nameOfDrink)) {
                        drinks[i].countOfItem += drink.countOfItem;
                        break;
                    }
                }
                else if (storageFreeSpace > 0) {
                        drinks[drinks.length - storageFreeSpace--] = drink;
                        break;
                    }
            }
        }
    }

    public Bar(String name) {
        this.name = name;
    }

    public void divideTips() {
        tipsForEach += tips / ((barmen.length - countOfBarmen) + (waiters.length - countOfWaiters));
        tips = 0;
    }

    public void hireEmployee(String name, byte years, String position) {
        if ((position.compareToIgnoreCase("waiter") == 0) && (countOfWaiters > 0) ) {
            Waiter waiter = new Waiter(name, years);
            waiters[waiters.length - countOfWaiters--] = waiter;
        }
        else if ((position.compareToIgnoreCase("barman") == 0) && (countOfBarmen > 0) ) {
            Barmen barman = new Barmen(name, years);
            barmen[barmen.length - countOfBarmen--] = barman;
        }
    }

    public void fireEmployee(String name, String position) {
        if ((position.compareToIgnoreCase("waiter") == 0) && (countOfWaiters != waiters.length) ) {
            for (int i = (waiters.length - countOfWaiters) - 1; i >= 0; i--) {
                if (name.compareToIgnoreCase(waiters[i].name) == 0) {
                    waiters[i] = null;
                    countOfWaiters++;
                    break;
                }
            }
        }
        else if ((position.compareToIgnoreCase("barman") == 0) && (countOfBarmen != barmen.length) ) {
            for (int i = (barmen.length - countOfBarmen) - 1; i >= 0; i--) {
                if (name.compareToIgnoreCase(barmen[i].name) == 0) {
                    barmen[i] = null;
                    countOfBarmen++;
                    break;
                }
            }
        }
    }

    public void setBailiwickCocktail(String bailiwickCocktail, int index) {
        barmen[index].bailiwickCocktail = bailiwickCocktail;
    }

    @Override
    public String toString() {
        String str = "Bar: \"" + name + "\"\n";
        for (int i = barmen.length; i > countOfBarmen; i--) {
            str += barmen[i - (countOfBarmen + 1)].toString() + "\n";
        }

        for (int i = waiters.length; i > countOfWaiters; i--) {
            str += waiters[i - (countOfWaiters + 1)].toString() + "\n";
        }

        for (int i = drinks.length; i > storageFreeSpace; i--) {
            str += drinks[i - (storageFreeSpace + 1)].toString() + "\n";
        }
        return str + "\nTips: " + tips;
    }

    @Override
    public boolean equals(Object obj) {
        if (null == obj) return false;
        if (this == obj) return true;
        if (obj instanceof Bar) {
            Bar bar = (Bar)obj;
            if (this.name != null && bar.name != null) {
                boolean equals = bar.name.equals(((Bar) obj).name);
                if (equals) {
                    equals = barmen.equals(((Bar) obj).barmen);
                    if (equals) {
                        equals = waiters.equals(((Bar) obj).waiters);
                        if (equals) {
                            equals = drinks.equals(((Bar) obj).drinks);
                            if (equals) {
                                return this.tips == ((Bar) obj).tips;
                            }
                        }
                    }
                }
            }
        }
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash += name.hashCode();
        hash += barmen.hashCode();
        hash += waiters.hashCode();
        return hash;
    }
}
