package vehicle;

import components.Engine;
import components.Tyre;

public class HybridCar extends Vehicle{
    public HybridCar(String colour, double price, Tyre tyre, Engine engine) {
        super(colour, price, tyre, engine);
    }
}
