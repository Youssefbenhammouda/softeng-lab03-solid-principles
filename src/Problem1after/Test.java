package Problem1after;



public class Test {
    public static void main(String[] args) {
        InvoiceData invData = new InvoiceData("Alami Samir");
        invData.addLine("Laptop", 9000.0);
        invData.addLine("Mouse", 150.0);
        invData.addLine("USB cable",50.0);

        InvoiceCalculator invoiceCalculator = new InvoiceCalculator();
        InvoicePrinter invoicePrinter = new InvoicePrinter(invoiceCalculator);
        System.out.println(invoicePrinter.print(invData));
    }
}
