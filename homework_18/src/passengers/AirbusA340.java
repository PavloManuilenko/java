package passengers;

public class AirbusA340 extends PassengerAirplane {

    public AirbusA340(int numberOfPassengers, int capacityOfShipment, int normalSpeed, float fuelConsumption, int volumeOfTank, int numOfStewardess) {
        super(numberOfPassengers, capacityOfShipment, normalSpeed, fuelConsumption, volumeOfTank, numOfStewardess);
    }

    public void setNumOfStewardess(int numOfStewardess) {
        super.numOfStewardess = numOfStewardess;
    }

}
