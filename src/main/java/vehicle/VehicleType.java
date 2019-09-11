package vehicle;

public abstract class VehicleType {

    private String make;
    private String model;
    private String colour;
    private double price;

    public VehicleType(String make, String model, String colour, double price){
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.price = price;
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
}
