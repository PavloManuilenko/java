package autosalon;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Car[] cars = {new Lanos(160, 10, Configuration.BAISIC),
                new Opel(180, 12, Configuration.EXCLUSIVE),
                new Mercedes(200, 15, Configuration.LUX),
                new Lanos (170, 10, Configuration.LUX),
                new Opel(185, 20, Configuration.LUX),
                new Mercedes(250, 25, Configuration.EXCLUSIVE)
        };
        AutoSalon autoSalon = new AutoSalon(cars);

        System.out.println("Total: " + autoSalon.calculateCarsPrice());
        System.out.println("Speed: " + Arrays.toString(autoSalon.getCarsBySpeedRange(160, 165)));
        System.out.println("Speed: " + Arrays.toString(autoSalon.sortByfuelCaosumption()));

        for (Car car: cars) {
            car.stop();
            car.beep();
            car.drive();
        }
    }
}
