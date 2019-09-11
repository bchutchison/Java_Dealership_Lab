package components;

import behaviours.IComponent;

public class Engine extends VehicleComponent implements IComponent {

    public Engine(double price, String make, String model){
        super(price, make, model);
    }
}
