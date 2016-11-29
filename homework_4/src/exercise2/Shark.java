package exercise2;

public class Shark extends Fish {
    String typeOfShark;

    public Shark(boolean vegan, String food, byte noOfLegs, String typeOfShark){
        super(vegan, food, noOfLegs);
        this.typeOfShark = typeOfShark;
    }

    public Shark(String food){
        super(false, food, (byte) 0);
        this.typeOfShark = "unknown";
    }

    private Shark(){
        super(false, "unknown", (byte) 0);
        this.typeOfShark = "unknown";
    }

    public String getTypeOfShark(){
        return this.typeOfShark;
    }
}