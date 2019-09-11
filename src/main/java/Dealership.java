import behaviours.IVehicle;
import vehicle.Hybrid;
import vehicle.VehicleType;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<IVehicle> stock;

    public Dealership(){
        stock = new ArrayList<IVehicle>();
    }

    public int getStockCount() {
        return this.stock.size();
    }

    public void addVehicle(VehicleType vehicle) {
        this.stock.add(vehicle);
    }
}
