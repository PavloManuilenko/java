package commercial;

public abstract class CommercialAirplane extends Airplane {

    int numOfPorters;

    public CommercialAirplane(int numberOfPassengers, int capacityOfShipment, int normalSpeed, float fuelConsumption, int volumeOfTank, int numOfPorters) {
        super(numberOfPassengers, capacityOfShipment, normalSpeed, fuelConsumption, volumeOfTank);
        this.numOfPorters = numOfPorters;
    }
}
