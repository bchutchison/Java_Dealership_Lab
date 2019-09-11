package purchasing;

import vehicle.VehicleType;

public abstract class SalesComponents {

    double cash;

    public SalesComponents(double cash){
        this.cash = cash;
    }

    public double getCash() {
        return cash;
    }

    public void buyVehicle(VehicleType vehicle){
        if(cash > vehicle.getPrice()) {
        cash -= vehicle.getPrice();
        }
    }

}
