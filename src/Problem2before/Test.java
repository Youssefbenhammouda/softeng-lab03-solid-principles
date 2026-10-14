package Problem2before;

public class Test {
    public static void main(String[] args) {
        ShippingCalculator shippingCalculator = new ShippingCalculator();
        String carrier = "PICKUP";
        double weightKg = 3.0;

        System.out.printf("Shipping cost for %.2fKG using %s carrier is %.2f MAD%n",weightKg,carrier,shippingCalculator.cost(carrier,weightKg));
    }
}
