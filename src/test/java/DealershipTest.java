import org.junit.Before;
import org.junit.Test;
import purchasing.Dealer;
import vehicle.Hybrid;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Hybrid hybrid;


    @Before
    public void setUp(){
        dealership = new Dealership();
        hybrid = new Hybrid("Honda", "Jazz", "blue", 5000.00);

    }

    @Test
    public void canAddVehicle(){
        dealership.addVehicle(hybrid);
        assertEquals(1, dealership.getStockCount());
    }

}
