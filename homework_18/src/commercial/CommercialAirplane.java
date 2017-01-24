package commercial;
import plane.Airplane;

public abstract class CommercialAirplane extends Airplane {

    int numOfPorters;

    public CommercialAirplane(int numberOfPassengers, int capacityOfShipment, int normalSpeed, int fuelConsumption, int volumeOfTank, int numOfPorters) {
        super(numberOfPassengers, capacityOfShipment, normalSpeed, fuelConsumption, volumeOfTank);
        this.numOfPorters = numOfPorters;
    }
}
