package commercial;

public class Bristol170 extends CommercialAirplane {

    public Bristol170(int numberOfPassengers, int capacityOfShipment, int normalSpeed, int fuelConsumption, int volumeOfTank, int numOfPorters) {
        super(numberOfPassengers, capacityOfShipment, normalSpeed, fuelConsumption, volumeOfTank, numOfPorters);
    }

    public void setnumOfPorters(int numOfPorters) {
        super.numOfPorters = numOfPorters;
    }

}
