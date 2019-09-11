package components;


public abstract class VehicleComponent {

    private double price;
    private String make;
    private String model;

    public VehicleComponent(double price, String make, String model){
        this.price = price;
        this.make = make;
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
}
