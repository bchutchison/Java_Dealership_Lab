import org.junit.Before;
import org.junit.Test;
import vehicle.Hybrid;

import static org.junit.Assert.assertEquals;

public class HybridTest {

    Hybrid hybrid;

    @Before
    public void setUp(){
        hybrid = new Hybrid("Honda", "Jazz", "blue", 5000.00);
    }

    @Test
    public void canGetMake(){
        assertEquals("Honda", hybrid.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("Jazz", hybrid.getModel());
    }

    @Test
    public void canGetColour(){
        assertEquals("blue", hybrid.getColour());
    }

    @Test
    public void canGetPrice(){
        assertEquals(5000.00, 0.01, hybrid.getPrice());
    }

}
