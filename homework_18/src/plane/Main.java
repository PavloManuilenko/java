package plane;

import commercial.An124;
import military.Su47;
import passengers.Boeing737;

public class Main {

    public static void main(String[] args) {


        Airplane[] airplanes = {
                new An124(10, 50_000, 400, 200, 5_000, 25),
                new Su47(2, 2_000, 800, 80, 500, true),
                new Boeing737(80, 15_000, 500, 120, 2_000, 2)
        };

        Airlines airlines = new Airlines(airplanes);

        System.out.println("Numbers of passengers: " + airlines.getAirlinesNumbersOfPassengers());
        System.out.println("Capacity of shipment: " + airlines.getAirlinesCapacityOfShipment());
        System.out.println("Airplanes with speed range (450 - 550): " + airlines.getAirplaneBySpeedRange(450, 550));
        System.out.println("Sort by fuel consumption: " + airlines.sortByFuelConsumption());


    }

}
