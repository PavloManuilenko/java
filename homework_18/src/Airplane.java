public abstract class Airplane {

    int numberOfPassengers;
    int capacityOfShipment;
    int normalSpeed;
    float fuelConsumption;
    int volumeOfTank;

    public Airplane(int numberOfPassengers, int capacityOfShipment, int normalSpeed, float fuelConsumption, int volumeOfTank) {
        this.numberOfPassengers = numberOfPassengers;
        this.capacityOfShipment = capacityOfShipment;
        this.normalSpeed = normalSpeed;
        this.fuelConsumption = fuelConsumption;
        this.volumeOfTank = volumeOfTank;
    }
}
