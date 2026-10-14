package Problem2after;

public class Parcel {
    private double weight;

    public Parcel(double weight){
        this.weight = weight;
    }
    double shippingCost(ShippingMethod method){
        return method.cost(weight);
    }
}
