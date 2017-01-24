package passengers;
import plane.Airplane;

public abstract class PassengerAirplane extends Airplane {

    int numOfStewardess;

    public PassengerAirplane(int numberOfPassengers, int capacityOfShipment, int normalSpeed, int fuelConsumption, int volumeOfTank, int numOfStewardess) {
        super(numberOfPassengers, capacityOfShipment, normalSpeed, fuelConsumption, volumeOfTank);
        this.numOfStewardess = numOfStewardess;
    }
}
