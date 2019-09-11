import org.junit.Before;
import org.junit.Test;
import purchasing.Customer;
import vehicle.Hybrid;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Hybrid hybrid;

    @Before
    public void setUp(){
        customer = new Customer(10000.00);
        hybrid = new Hybrid("Honda", "Jazz", "blue", 5000.00);

    }

    @Test
    public void hasCash(){
        assertEquals(10000.00, 0.01, customer.getCash());
    }

    @Test
    public void canBuyVehicle(){
        customer.buyVehicle(customer, hybrid);
        assertEquals(5000.00, 0.01, customer.getCash());
    }

}
