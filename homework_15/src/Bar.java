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
У бара должен быть метод getDrinkCount, который возвращает кол-во запасов по заданному названию напитка,
в случае если напиток закончился или не существует необходимо возвращать значение -1.
У бара необходимо объявить метод getDrinkByName, который вернет объект напитка.
В случае если напиток неьбыл найден, необходимо возрващать null.

После того как бармен выполнил заказ необходимо вычесть заданное кол-во напитков из запаса бара.
В случае если запасы закончились нужно удалить напиток из бара.
*/
public class Bar {
    String name = new String();
    Barman[] barmen = new Barman[10];
    Waiter[] waiters = new Waiter[20];
    Drink[] drinks = new Drink[5];
    Order[] orders = new Order[30];
    protected int volumeOfOrders = orders.length;
    private int storageFreeSpace = drinks.length;
    private int tips = 0;
    private int tipsForEach = 0;
    private int countOfBarmen = barmen.length;
    private int countOfWaiters = waiters.length;

    public Bar(String name) {
        this.name = name;
    }

    public void hireEmployee(String name, byte years, String position, Bar bar) throws NotExistBarException {
        if (null != bar) {
            if ((position.equalsIgnoreCase("waiter")) && (countOfWaiters > 0)) {
                Waiter waiter = new Waiter(name, years, bar);
                bar.waiters[waiters.length - countOfWaiters--] = waiter;
            } else if ((position.equalsIgnoreCase("barman")) && (countOfBarmen > 0)) {
                Barman barman = new Barman(name, years, bar);
                bar.barmen[barmen.length - countOfBarmen--] = barman;
            }
        }
        else throw new NotExistBarException("For creating new employee was passed not.");
    }

    public void fireEmployee(String name, String position) {
        if ((position.equalsIgnoreCase("waiter")) && (countOfWaiters != waiters.length)) {
            for (int i = (waiters.length - countOfWaiters) - 1; i >= 0; i--) {
                if (name.equalsIgnoreCase(waiters[i].name)) {
                    waiters[i] = null;
                    countOfWaiters++;
                    break;
                }
            }
        } else if ((position.equalsIgnoreCase("barman")) && (countOfBarmen != barmen.length)) {
            for (int i = (barmen.length - countOfBarmen) - 1; i >= 0; i--) {
                if (name.equalsIgnoreCase(barmen[i].name)) {
                    barmen[i] = null;
                    countOfBarmen++;
                    break;
                }
            }
        }
    }

    public void addToStorage(Drink drink) {
        if (null != drink) {
            for (int i = 0; i < drinks.length; i++) {
                if (null != drinks[i]) {
                    if (drinks[i].nameOfDrink.equals(drink.nameOfDrink)) {
                        drinks[i].countOfItem += drink.countOfItem;
                        break;
                    }
                } else if (storageFreeSpace > 0) {
                    drinks[drinks.length - storageFreeSpace--] = drink;
                    break;
                }
            }
        }
    }

    public void makeOrder(String nameOfDrink, int countOfItem) throws OrderDrinkOverException {
        for (int i = 0; i < (drinks.length - storageFreeSpace); i++) {
            if (drinks[i].nameOfDrink.equalsIgnoreCase(nameOfDrink)) {
                if (drinks[i].countOfItem >= countOfItem) {
                    Order newOrder = new Order((orders.length - volumeOfOrders + 1), drinks[i].nameOfDrink, countOfItem);
                    orders[orders.length - volumeOfOrders--] = newOrder;
                } else throw new OrderDrinkOverException("Not correct value for order: " +
                        (orders.length - volumeOfOrders + 1) + ". Requested drink: " + nameOfDrink + " is over.");
            }
        }
    }

    public void doTheOrder(String nameOfDrink, int countOfItem) {
        for (int i = 0; i < orders.length; i++) {
            if (null == orders[i]) break;
            if ((orders[i].nameOfDrink.equalsIgnoreCase(nameOfDrink)) && (orders[i].countOfItem == countOfItem)) {

                for (int y = 0; y < drinks.length; y++) {
                    if (orders[i].nameOfDrink.equalsIgnoreCase(drinks[y].nameOfDrink)) {
                        drinks[y].countOfItem -= countOfItem;
                        if (drinks[y].countOfItem <= 0) deleteTheDrink(y);
                        break;
                    }
                }

                for (int j = i + 1; j < orders.length; j++) {
                    if (i == orders.length-1) {
                        orders[i] = null;
                        volumeOfOrders++;
                        break;
                    }

                    orders[j - 1] = orders[j];
                }
                orders[orders.length - 1] = null;
                volumeOfOrders++;
                break;
            }
        }

    }

    void addTips(int tips) throws NegativeTipsException {
        if (tips <= 0) throw new NegativeTipsException("Tips couldn't be negative. Passed value is: " + tips);
        else this.tips += tips;
    }

    public void divideTips() {
        tipsForEach += tips / ((barmen.length - countOfBarmen) + (waiters.length - countOfWaiters));
        tips = 0;
    }

    public void setBailiwickCocktail(String bailiwickCocktail, int index) {
        barmen[index].bailiwickCocktail = bailiwickCocktail;
    }

    public int getDrinkCount(String nameOfDrink) {
        for (int i = 0; i < drinks.length; i++) {
            if (null != drinks[i] && drinks[i].nameOfDrink.equalsIgnoreCase(nameOfDrink)) {
                if (drinks[i].countOfItem == 0)  return -1;
                else return drinks[i].countOfItem;
            }
        }
        return -1;
    }

    public Drink getDrinkByName(String nameOfDrink) {
        for (int i = 0; i < drinks.length - storageFreeSpace; i++) {
            if (nameOfDrink.equalsIgnoreCase(drinks[i].nameOfDrink)) {
                return drinks[i];
            }
        }
        return null;
    }

    public int lookingForDrink(String nameOfDrink) {
        for (int i = 0; i < drinks.length; i++) {
            if (null != drinks[i]) {
                if (drinks[i].nameOfDrink.equalsIgnoreCase(nameOfDrink)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public void deleteTheDrink(int index) {
        if (index == drinks.length - 1) {
            drinks[index] = null;
            storageFreeSpace++;
        }
        else {
            for (int i = index + 1; i < drinks.length; i++) {
                drinks[i - 1] = drinks[i];
            }
            drinks[drinks.length - 1] = null;
            storageFreeSpace++;
        }
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
            Bar bar = (Bar) obj;
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