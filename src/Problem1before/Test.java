package Problem1before;

public class Test {
    public static void main(String[] args) {
        Invoice inv = new Invoice("Alami Samir");
        inv.addLine("Laptop", 9000.0);
        inv.addLine("Mouse", 150.0);
        inv.addLine("USB cable",50.0);

        System.out.println(inv.print());
    }
}
