package exercise2;

public class Cow extends Mammal {
    boolean hoof;

    public Cow(boolean vegan, String food, byte noOfLegs, boolean hoof){
        super(vegan, food, noOfLegs);
        this.hoof = hoof;
    }

    public Cow(boolean vegan, String food, byte noOfLegs){
        super(vegan, food, noOfLegs);
        this.hoof = true;
    }

    public Cow(boolean hoof){
        super(true, "Grass", (byte) 4);
        this.hoof = hoof;
    }

    public Cow(){
        super(true, "Grass", (byte) 4);
        this.hoof = true;
    }


    public boolean isHoof(){
        return this.hoof;
    }
}