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

    public void completeOrder(int orderNumber, String nameOfDrink) {
        for (int i = 0; i < (Bar.orders.length - Bar.volumeOfOrders); i++) {
            if ((Bar.orders[i].orderNumber == orderNumber) && (Bar.orders[i].nameOfDrink.compareToIgnoreCase(nameOfDrink) == 0)) {
                for (int j = 0; j < Bar.drinks.length; j++) {
                    if (Bar.drinks[j].nameOfDrink.compareToIgnoreCase(nameOfDrink) == 0) {
                        Bar.drinks[j].countOfItem -= Bar.orders[i].countOfItem;
                        Bar.volumeOfOrders++;
                        break;
                    }
                }
                for (int o = i; o < (Bar.orders.length - Bar.volumeOfOrders) - 1; o++) {
                    Bar.orders[o] = Bar.orders[o + 1];
                }
                Bar.orders[Bar.orders.length - 1] = null;
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