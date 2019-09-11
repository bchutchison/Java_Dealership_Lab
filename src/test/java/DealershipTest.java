import org.junit.Before;
import org.junit.Test;
import purchasing.Customer;
import purchasing.Dealer;
import vehicle.Hybrid;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Hybrid hybrid;
    Customer customer;
    Dealer dealer;


    @Before
    public void setUp(){
        dealership = new Dealership();
        hybrid = new Hybrid("Honda", "Jazz", "blue", 5000.00);
        customer = new Customer(10000.00);
        dealer = new Dealer(50000.00);
    }

    @Test
    public void canAddVehicle(){
        dealership.addVehicle(hybrid);
        assertEquals(1, dealership.getStockCount());
    }

    @Test
    public void canGetDealerCash(){
        assertEquals(50000.00, 0.01, dealership.getCash(dealer));
    }

    @Test
    public void canGetCustomerCash(){
        assertEquals(10000.00, 0.01, dealership.getCash(customer));
    }

    @Test
    public void dealerCanSellCar() {
        dealer.sellVehicle(hybrid);
        assertEquals(55000, 0.01, dealership.getCash(dealer));
    }



}
