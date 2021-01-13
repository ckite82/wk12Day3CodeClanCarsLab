package vehicle;

import components.Engine;
import components.Tyre;

public class Car extends Vehicle {

    public Car(String colour, double price, Tyre tyre, Engine engine) {
        super(colour, price, tyre, engine);
        engine = new Engine(1600, "unleaded");
    }
}
