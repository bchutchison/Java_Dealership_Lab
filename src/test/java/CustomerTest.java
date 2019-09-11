import org.junit.Before;
import org.junit.Test;
import purchasing.Customer;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;

    @Before
    public void setUp(){
        customer = new Customer(10000.00);
    }

    @Test
    public void hasCash(){
        assertEquals(10000.00, 0.01, customer.getCash());
    }

}
