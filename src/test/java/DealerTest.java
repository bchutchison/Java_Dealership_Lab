import org.junit.Before;
import org.junit.Test;
import purchasing.Dealer;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    Dealer dealer;

    @Before
    public void setUp(){
        dealer = new Dealer(50000.00);
    }

    @Test
    public void hasCash(){
        assertEquals(50000.00, 0.01, dealer.getCash());
    }
}
