import components.Engine;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;
import vehicle.Hybrid;

import static org.junit.Assert.assertEquals;

public class HybridTest {

    Hybrid hybrid;
    Engine engine;
    Tyres tyres;

    @Before
    public void setUp(){
        hybrid = new Hybrid("Honda", "Jazz", "blue", 5000.00);
        engine = new Engine(12000.00, "Ford", "Boss");
        tyres = new Tyres(400, "Michelin", "CrossClimates");
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

    @Test
    public void canAddComponent(){
        hybrid.addComponent(engine);
        hybrid.addComponent(tyres);
        assertEquals(2, hybrid.getComponentCount());
    }

}
