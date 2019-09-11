import components.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void setUp(){
        engine = new Engine(1200.00, "Ford", "Boss");
    }

    @Test
    public void canGetMake(){
        assertEquals("Ford", engine.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("Boss", engine.getModel());
    }

    @Test
    public void canGetPrice(){
        assertEquals(1200.00, 0.01, engine.getPrice());
    }

}
