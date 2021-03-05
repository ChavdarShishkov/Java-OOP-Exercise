package Exercise_03_Inheritance.P04_NeedForSpeed;

public class Car extends Vehicle {

    private static final double DEFAULT_FUEL_CONSUMPTION = 3;

    public Car(double fuel, int horsepower) {
        super(fuel, horsepower);
        super.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
