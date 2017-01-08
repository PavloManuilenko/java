/*
Количество напитков, каждого вида (массив объектов. не более 5 элементов, для примера. Каждый элемент - это напиток.
Свойства этого элемента - название, количество единиц этого напитка. Единицы измерения можно сделать какими угодно - литры, килограммы, бутылки)

Необходимо расширить свойства напитка, таким образом, чтобы у него было название, объем, количество и стоимость.
*/
public class Drink {
    String nameOfDrink;
    int countOfItem;
    float volume;
    int price;

    public Drink(String nameOfDrink, int countOfItem) {
        this.nameOfDrink = nameOfDrink;
        this.countOfItem = countOfItem;
    }

    public Drink(String nameOfDrink, int countOfItem, float volume, int price) {
        this.nameOfDrink = nameOfDrink;
        this.countOfItem = countOfItem;
        this.volume = volume;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        String toString = "Name of drink: " + nameOfDrink + ", count of item: " + countOfItem;
        if (volume > 0 && price > 0) toString += ", volume: " + volume + ", price: " + price;
        return toString;
    }

    @Override
    public boolean equals(Object obj) {
        if (null == obj) return false;
        if (this == obj) return true;
        if (obj instanceof Employee) {
            Drink drink = (Drink) obj;
            if (this.nameOfDrink != null && drink.nameOfDrink != null) {
                boolean equals = drink.nameOfDrink.equals(((Drink) obj).nameOfDrink);
                if (equals) {
                    return drink.countOfItem == ((Drink) obj).countOfItem;
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
        return hash;
    }
}