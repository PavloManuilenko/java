package plane;

import java.util.*;

public class Airlines {

    public Airplane[] planes;

    public Airlines(Airplane[] planes) {
        this.planes = planes;
    }

    public int getAirlinesNumbersOfPassengers() {
        int totalCountOfPassengers = 0;
        for (Airplane plane : planes) {
            totalCountOfPassengers += plane.numberOfPassengers;
        }
        return totalCountOfPassengers;
    }

    public int getAirlinesCapacityOfShipment() {
        int totalCapacityOfShipment = 0;
        for (Airplane plane : planes) {
            totalCapacityOfShipment += plane.capacityOfShipment;
        }
        return totalCapacityOfShipment;
    }

    public Airplane[] getAirplaneBySpeedRange(int from, int to)
    {
        List<Airplane> AirplaneList = new ArrayList<>();
        for (Airplane plane : planes)
        {
            if (plane.getSpeed() <= to && plane.getSpeed() >= from)
            {
                AirplaneList.add(plane);
            }
        }
        return AirplaneList.toArray(new Airplane[1]);
    }

    public List<Airplane> sortByFuelConsumption()
    {
        List<Airplane> res = Arrays.asList(planes);
        Collections.sort(res, getComparator());
        return res;
    }

    private Comparator<Airplane> getComparator()
    {
        return (c1, c2) -> Double.compare(c1.getFuelConsumption(), c2.getFuelConsumption());
    }


}
