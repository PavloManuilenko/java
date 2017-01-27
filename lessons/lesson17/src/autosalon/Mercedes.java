package autosalon;

/**
 * Created by java on 13.01.2017.
 */
public class Mercedes extends Car {

    public Mercedes(int maxSpeed, double fuelCaosumption, Configuration configuration) {
        super(maxSpeed, fuelCaosumption, configuration);
    }

    @Override
    public double getPrice() {
        switch (getConfiguration()) {
            case LUX : return 110_000;
            case EXCLUSIVE : return 160_000;
            default: return 60_000;
        }
    }
}
