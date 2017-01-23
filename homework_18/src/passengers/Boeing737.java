package passengers;

public class Boeing737 extends PassengerAirplane{

    public Boeing737(int numberOfPassengers, int capacityOfShipment, int normalSpeed, float fuelConsumption, int volumeOfTank, int numOfStewardess) {
        super(numberOfPassengers, capacityOfShipment, normalSpeed, fuelConsumption, volumeOfTank, numOfStewardess);
    }

    public void setNumOfStewardess(int numOfStewardess) {
        super.numOfStewardess = numOfStewardess;
    }
}
