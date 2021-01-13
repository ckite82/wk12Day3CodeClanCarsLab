package vehicle;

import components.Engine;
import components.Tyre;
import org.junit.Before;
import org.junit.Test;
import vehicle.Car;
import vehicle.Vehicle;

import static org.junit.Assert.assertEquals;

public class CarTest {
    Car car;
    Tyre tyre;
    Engine engine;

    @Before
    public void before(){
        tyre = new Tyre("Goodyear", 1600);
        engine = new Engine(1800, "unleaded");
        car = new Car("red", 10000, tyre, engine);
    }

    @Test
    public void hasColour(){
        assertEquals("red", car.getColour());
    }

    @Test
    public void hasPrice(){
        assertEquals(10000, car.getPrice(), 0.01);
    }

    @Test
    public void setColour(){
        car.setColour("black");
        assertEquals("black", car.getColour());
    }

    @Test
    public void setPrice(){
        car.setPrice(5000);
        assertEquals(5000, car.getPrice(), 0.01);
    }

    @Test
    public void hasEngineSize(){
//        car.engine.getEngineSize();
        assertEquals(1800, car.engine.getEngineSize());
    }

    @Test
    public void hasTyreBrand(){
        assertEquals("Goodyear", car.tyre.getBrand());
    }
}
