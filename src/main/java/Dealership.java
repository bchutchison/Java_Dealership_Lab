import behaviours.IVehicle;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<IVehicle> stock;

    public Dealership(){
        stock = new ArrayList<IVehicle>();
    }

    public int getStockCount() {
        return this.stock.size();
    }

    public void addVehicle(IVehicle vehicle) {
        this.stock.add(vehicle);
    }
}
