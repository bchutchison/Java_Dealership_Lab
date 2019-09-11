package vehicle;

import behaviours.IComponent;
import behaviours.IVehicle;

import java.util.ArrayList;

public abstract class VehicleType implements IVehicle {

    private String make;
    private String model;
    private String colour;
    private double price;
    private ArrayList<IComponent> components;

    public VehicleType(String make, String model, String colour, double price){
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.price = price;
        this.components = new ArrayList<IComponent>();
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public double getPrice() {
        return price;
    }


    public void addComponent(IComponent component){
        this.components.add(component);
    };

    public int getComponentCount(){
        return this.components.size();
    };
}
