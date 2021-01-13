package vehicle;

import components.Engine;
import components.Tyre;

public class ElectricCar extends Vehicle {

    public ElectricCar(String colour, double price, Tyre tyre, Engine engine) {
        super(colour, price, tyre, engine);
    }
}
