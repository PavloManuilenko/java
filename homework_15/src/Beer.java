/*
Описать на основе класса напитка, следующие классы наследники: Beer, CocaCola, Juice, Vodka.
Все классы наследники должны иметь четко заданные значения свойств, описанных в родительском классе,
за исключением количества, которое должно задаваться динамически. Эти классы предназначены для хранения на баре.
*/
public class Beer extends Drink {

    public Beer(int quantity){
        super("Beer", quantity, 0.5F, 25);
    }

}