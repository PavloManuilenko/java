package commercial;

public class An124 extends CommercialAirplane {

    public An124(int numberOfPassengers, int capacityOfShipment, int normalSpeed, float fuelConsumption, int volumeOfTank, int numOfPorters) {
        super(numberOfPassengers, capacityOfShipment, normalSpeed, fuelConsumption, volumeOfTank, numOfPorters);
    }

    public void setnumOfPorters(int numOfPorters) {
        super.numOfPorters = numOfPorters;
    }

}
