package military;

public class LockheedF117 extends MilitaryAirplane {

    public LockheedF117(int numberOfPassengers, int capacityOfShipment, int normalSpeed, int fuelConsumption, int volumeOfTank, boolean isWeaponOnTheBoard) {
        super(numberOfPassengers, capacityOfShipment, normalSpeed, fuelConsumption, volumeOfTank, isWeaponOnTheBoard);
    }

    public void setWeapon(boolean weapon) {
        super.isWeaponOnTheBoard = weapon;
    }

}
