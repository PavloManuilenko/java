public class Lamp extends ArtificialLight{

    static private int quantity = 0;

    public Lamp(boolean shining) {
        super(shining, "Lamp");
    }

    public Lamp(boolean shining, String sourceName) {
        super(shining, sourceName);
    }

    public static void setQuantity(int quantity) {
        Lamp.quantity += quantity;
    }

    public static int getQuantity() {
        System.out.printf("Number of light sources: %d", quantity);
        return quantity;
    }

    @Override
    public String isBurning() {
        return null;
    }

    @Override
    public void sunset() {

    }

    @Override
    public void sunrise() {

    }

    @Override
    public void burnUp() {

    }

    @Override
    public void burnDown() {

    }
}