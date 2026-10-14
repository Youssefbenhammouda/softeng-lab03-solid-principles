package Problem1after;

public class InvoicePrinter {
    private final InvoiceCalculator invoiceCalculator;

    public InvoicePrinter(InvoiceCalculator invoiceCalculator){
        this.invoiceCalculator = invoiceCalculator;
    }

    public String print(InvoiceData inv) {
        StringBuilder sb = new StringBuilder();
        sb.append("Invoice for ").append(inv.getCustomer()).append("\n");
        var items = inv.getItems();
        for (int i = 0; i < items.size(); i++)
            sb.append(line(items.get(i), inv.getPrices().get(i)));
        sb.append(line("Subtotal", invoiceCalculator.subtotal(inv)));
        sb.append(line("TOTAL", invoiceCalculator.total(inv)));
        return sb.toString();}

    private String line(String label, double value) {
        return String.format("%-12s %8.2f%n", label, value);
    }
}
