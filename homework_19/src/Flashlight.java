public class Flashlight extends Lamp{

    public Flashlight(boolean shining) {
        super(shining, "Flashlight");
        Lamp.setQuantity(1);
    }

}