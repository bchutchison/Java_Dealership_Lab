package purchasing;

import vehicle.Hybrid;
import vehicle.VehicleType;

public class Dealer extends SalesComponents{

    public Dealer(double cash){
        super(cash);
    }

    public void sellVehicle(VehicleType vehicle) {
        this. += vehicle.getPrice();
    }

}
