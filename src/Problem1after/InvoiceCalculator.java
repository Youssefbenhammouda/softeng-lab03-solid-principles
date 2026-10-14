package Problem1after;

public class InvoiceCalculator {

    protected double subtotal(InvoiceData inv) {
        double sum = 0;
        for (double p : inv.getPrices()) sum += p;
        return sum;
    }
    public double total(InvoiceData inv) { // 20% VAT
        return subtotal(inv) * 1.20;
    }

}
