/*
У каждого бармена есть свой “коронный” коктейль. Просто строковое свойство.
У всех барменов есть метод “выполнить заказы”. Передав первым аргументом в этот метод название напитка,
а вторым - число, можно использовать (уменьшить количество напитка) на указанное число.
При этом необходимо удалить выполненный заказ из общего списка заказов.

- Для каждого класса переопределить методы equals(), hashCode() и toString().
*/
public class Barmen extends Employee {
    String bailiwickCocktail = new String();

    public Barmen(String name, byte years, Bar bar) {
        super(name, years, bar);
        bailiwickCocktail = "Beer";
    }

    public Barmen(String name, byte years, Bar bar, String bailiwickCocktail) {
        super(name, years, bar);
        this.bailiwickCocktail = bailiwickCocktail;
    }

    public void setBailiwickCocktail(String bailiwickCocktail) {
        this.bailiwickCocktail = bailiwickCocktail;
    }

    public void completeOrder(String nameOfDrink, int countOfItem) {
        bar.doTheOrder(nameOfDrink, countOfItem);
    }

    @Override
    public String toString() {
        String toString = "Name: " + name + ", years old: " + years + ", bailiwick cocktail: " + bailiwickCocktail;
        return toString;
    }

    @Override
    public boolean equals(Object obj) {
        if (null == obj) return false;
        if (this == obj) return true;
        if (obj instanceof Waiter) {
            Barmen barmen = (Barmen) obj;
            if (this.name != null && barmen.name != null) {
                boolean equals = barmen.name.equals(((Barmen) obj).name);
                if (equals) {
                    equals = barmen.years == ((Barmen) obj).years;
                    if (equals) {
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