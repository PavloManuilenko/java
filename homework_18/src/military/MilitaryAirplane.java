package military;

public abstract class MilitaryAirplane extends Airplane {

    boolean isWeaponOnTheBoard;

    public MilitaryAirplane(int numberOfPassengers, int capacityOfShipment, int normalSpeed, float fuelConsumption, int volumeOfTank, boolean isWeaponOnTheBoard) {
        super(numberOfPassengers, capacityOfShipment, normalSpeed, fuelConsumption, volumeOfTank);
        this.isWeaponOnTheBoard = isWeaponOnTheBoard;
    }
}
