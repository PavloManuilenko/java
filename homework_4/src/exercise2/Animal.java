package exercise2;

public class Animal {
    private boolean vegetarian;
    private String eats;
    private byte noOfLegs;

    public Animal(boolean vegan, String food, byte noOfLegs){
        vegetarian = vegan;
        eats = food;
        this.noOfLegs = noOfLegs;
    }

    protected boolean isVegetarian() {
        return vegetarian;
    }

    protected String getEats(){
        return eats;
    }

    protected byte getNoOfLegs(){
        return noOfLegs;
    }
}