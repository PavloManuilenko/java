package military;

public class Su47 extends MilitaryAirplane{

    public Su47(int numberOfPassengers, int capacityOfShipment, int normalSpeed, float fuelConsumption, int volumeOfTank, boolean isWeaponOnTheBoard) {
        super(numberOfPassengers, capacityOfShipment, normalSpeed, fuelConsumption, volumeOfTank, isWeaponOnTheBoard);
    }

    public void setWeapon(boolean weapon) {
        super.isWeaponOnTheBoard = weapon;
    }

}
