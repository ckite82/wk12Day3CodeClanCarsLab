package components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyreTest {
    Tyre tyre;

    @Before
    public void before(){
        tyre = new Tyre("Goodyear", 16);
    }

    @Test
    public void hasBrand(){
        assertEquals("Goodyear", tyre.getBrand());
    }

    @Test
    public void hasTyreSize(){
        assertEquals(16, tyre.getTyreSize());
    }

    @Test
    public void setBrand(){
        tyre.setBrand("Toyo");
        assertEquals("Toyo", tyre.getBrand());
    }

    @Test
    public void setTyreSize(){
        tyre.setTyreSize(15);
        assertEquals(15, tyre.getTyreSize());
    }
}
