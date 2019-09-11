import behaviours.IVehicle;
import purchasing.SalesComponents;
import vehicle.Hybrid;

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

    public double getCash(SalesComponents person){
       return person.getCash();
    }

    public void vehicleSale(Hybrid hybrid) {
    }
}
