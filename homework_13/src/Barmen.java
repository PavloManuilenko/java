/*
У каждого бармена есть свой “коронный” коктейль. Просто строковое свойство.
У всех барменов есть метод “выполнить заказы”. Передав первым аргументом в этот метод название напитка,
а вторым - число, можно использовать (уменьшить количество напитка) на указанное число.
При этом необходимо удалить выполненный заказ из общего списка заказов.

- Для каждого класса переопределить методы equals(), hashCode() и toString().
*/
public class Barmen extends Employee {
    String bailiwickCocktail = new String();

    public Barmen() {
        name = "Barmen";
        years = 25;
        bailiwickCocktail = "Beer";
    }

    public Barmen(String name, byte years) {
        this.name = name;
        this.years = years;
        bailiwickCocktail = "Beer";
    }

    public Barmen(String name, byte years, String bailiwickCocktail) {
        this.name = name;
        this.years = years;
        this.bailiwickCocktail = bailiwickCocktail;
    }

    public void setBailiwickCocktail(String bailiwickCocktail) {
        this.bailiwickCocktail = bailiwickCocktail;
    }

    public void completeOrder(String nameOfDrink, int countOfItem) {
        for (int i = 0; i < Bar.orders.length; i++) {
            if (null == Bar.orders[i]) break;

            if ((Bar.orders[i].nameOfDrink.compareToIgnoreCase(nameOfDrink) == 0) && (Bar.orders[i].countOfItem == countOfItem)) {
                for (int j = i + 1; j < Bar.orders.length; j++) {
                    if (i == Bar.orders.length) {
                        Bar.orders[i] = null;
                        Bar.volumeOfOrders++;
                        break;
                    }

                    Bar.orders[j - 1] = Bar.orders[j];
                }
                Bar.orders[Bar.orders.length - 1] = null;
                Bar.volumeOfOrders++;
                break;
            }
        }
    }

    @Override
    public String toString() {
        String toString = "Name: " + name + ", years old: " + years + ", bailiwick cocktail: " + bailiwickCocktail;
        return toString;
    }

    @Override
    public boolean equals (Object obj) {
        if (null == obj) return false;
        if (this == obj) return true;
        if (obj instanceof Waiter) {
            Barmen barmen = (Barmen)obj;
            if (this.name != null && barmen.name != null) {
                boolean equals = barmen.name.equals(((Barmen) obj).name);
                if (equals) {
                    equals = barmen.years == ((Barmen) obj).years;
                    if (equals){
                        return barmen.bailiwickCocktail.equals(((Barmen) obj).bailiwickCocktail);
                    }
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
        hash += this.bailiwickCocktail.hashCode();
        return hash;
    }
}