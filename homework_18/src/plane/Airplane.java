package plane;

public abstract class Airplane {

    int numberOfPassengers;
    int capacityOfShipment;
    int normalSpeed;
    int fuelConsumption;
    int volumeOfTank;

    public Airplane(int numberOfPassengers, int capacityOfShipment, int normalSpeed, int fuelConsumption, int volumeOfTank) {
        this.numberOfPassengers = numberOfPassengers;
        this.capacityOfShipment = capacityOfShipment;
        this.normalSpeed = normalSpeed;
        this.fuelConsumption = fuelConsumption;
        this.volumeOfTank = volumeOfTank;
    }

    public int getSpeed() {
        return normalSpeed;
    }

    public float getFuelConsumption() {
        return fuelConsumption;
    }
}
