package vehicle;

import components.Engine;
import components.Tyre;
import org.junit.Before;
import vehicle.HybridCar;

public class HybridCarTest {

    HybridCar hybridCar;
    Tyre tyre;
    Engine engine;

    @Before
    public void before(){
        hybridCar = new HybridCar("blue", 7500, tyre, engine);
        }
    }
