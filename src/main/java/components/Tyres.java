package components;

import behaviours.IComponent;

public class Tyres extends VehicleComponent implements IComponent {

    public Tyres(double price, String make, String model){
        super(price, make, model);
    }
}
