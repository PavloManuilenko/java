package exercise2;

public class Animal {
    boolean vegetarian;
    String eats;
    byte noOfLegs;

    public Animal(boolean vegan, String food, byte noOfLegs){
        vegetarian = vegan;
        eats = food;
        this.noOfLegs = noOfLegs;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public String getEats(){
        return eats;
    }

    public byte getNoOfLegs(){
        return noOfLegs;
    }
}