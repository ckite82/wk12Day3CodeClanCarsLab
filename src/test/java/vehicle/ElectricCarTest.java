package vehicle;

import components.Engine;
import components.Tyre;
import org.junit.Before;
import vehicle.ElectricCar;

public class ElectricCarTest {

    ElectricCar electricCar;
    Tyre tyre;
    Engine engine;

    @Before
    public void before() {
        electricCar = new ElectricCar("white", 1000, tyre, engine);
    }


}
