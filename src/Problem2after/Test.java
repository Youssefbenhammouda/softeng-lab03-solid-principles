package Problem2after;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Parcel parcel = new Parcel(2);

        List<ShippingMethod> methods = List.of(
                new StandardShipping(),
                new ExpressShipping(),
                new DroneShipping(),
                new PickupShipping()
        );

        for (ShippingMethod m : methods)
            System.out.printf("%s: %.2f MAD%n", m.name(), parcel.shippingCost(m));
    }
}
