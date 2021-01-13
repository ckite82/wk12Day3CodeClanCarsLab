package vehicle;

import components.Engine;
import components.Tyre;

public abstract class Vehicle {

    private String colour;
    private double price;
    Tyre tyre;
    Engine engine;

    public Vehicle(String colour, double price, Tyre tyre, Engine engine) {
        this.colour = colour;
        this.price = price;
        this.tyre = tyre;
        this.engine = engine;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
