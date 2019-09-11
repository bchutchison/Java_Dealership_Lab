package purchasing;

import vehicle.VehicleType;

public abstract class SalesComponents {

    private double cash;

    public SalesComponents(double cash){
        this.cash = cash;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public void buyVehicle(SalesComponents person, VehicleType vehicle){
        this.cash -= vehicle.getPrice();
    }
}
