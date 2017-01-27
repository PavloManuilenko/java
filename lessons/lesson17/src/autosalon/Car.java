package autosalon;

public abstract class Car implements Action{
    private double fuelCaosumption;
    private int maxSpeed;
    private int speed;
    private Configuration configuration;

    public Car(int maxSpeed, double fuelCaosumption, Configuration configuration) {
        this.fuelCaosumption = fuelCaosumption;
        this.maxSpeed = maxSpeed;
        this.configuration = configuration;
    }

    @Override
    public void stop() {
        speed = 0;
        System.out.println("Car is stoped. Speed is " + speed);
    }

    @Override
    public void drive() {
        speed = maxSpeed;
        System.out.println("Car is moving. Speed is " + speed);
    }

    @Override
    public void beep() {
        System.out.println("Beep-beep!");
    }

    public abstract double getPrice();

    public double getFuelCaosumption() {
        return fuelCaosumption;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public Configuration getConfiguration() {
        return configuration;
    }

    public void setFuelCaosumption(double fuelCaosumption) {
        this.fuelCaosumption = fuelCaosumption;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public String toString() {
        return "Car{" +
                "fuelCaosumption=" + fuelCaosumption +
                ", maxSpeed=" + maxSpeed +
                ", configuration=" + configuration +
                '}';
    }
}
