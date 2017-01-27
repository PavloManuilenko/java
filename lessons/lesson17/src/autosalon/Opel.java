package autosalon;

/**
 * Created by java on 13.01.2017.
 */
public class Opel extends Car {

    public Opel(int maxSpeed, double fuelCaosumption, Configuration configuration) {
        super(maxSpeed, fuelCaosumption, configuration);
    }

    @Override
    public double getPrice() {
        switch (getConfiguration()) {
            case LUX : return 11_000;
            case EXCLUSIVE : return 16_000;
            default: return 6_000;
        }
    }
}
