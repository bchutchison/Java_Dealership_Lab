import org.junit.Before;
import purchasing.Dealer;
import vehicle.Hybrid;

public class DealershipTest {

    Dealership dealership;
    Hybrid hybrid;


    @Before
    public void setUp(){
        dealership = new Dealership();
        hybrid = new Hybrid("Honda", "Jazz", "blue", 5000.00);

    }

}
