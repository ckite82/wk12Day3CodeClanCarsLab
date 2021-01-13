package components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before(){
        engine = new Engine(1600, "diesel");
    }

    @Test
    public void hasEngineSize(){
        assertEquals(1600, engine.getEngineSize());
    }

    @Test
    public void hasFuelType(){
        assertEquals("diesel", engine.getFuelType());
    }

    @Test
    public void setBrand(){
        engine.setEngineSize(2000);
        assertEquals(2000, engine.getEngineSize());
    }

    @Test
    public void setFuelType(){
        engine.setFuelType("unleaded");
        assertEquals("unleaded", engine.getFuelType());
    }
}
