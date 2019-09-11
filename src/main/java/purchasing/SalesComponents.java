package purchasing;

public abstract class SalesComponents {

    private double cash;

    public SalesComponents(double cash){
        this.cash = cash;
    }

    public double getCash() {
        return cash;
    }
}
