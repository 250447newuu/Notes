public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.problem1();
        m.problem2();
    }
    void problem1() {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5, 10);
        System.out.println("----------------------------------------");
        System.out.println("The length:" + r1.getLength());
        System.out.println("The width:" + r1.getWidth());
        System.out.println("The area;" + r1.calculateArea());
        System.out.println("The perimeter:" + r1.calculatePerimeter());
        System.out.println("----------------------------------------");
        System.out.println("The length:" + r2.getLength());
        System.out.println("The width:" + r2.getWidth());
        System.out.println("The area;" + r2.calculateArea());
        System.out.println("The perimeter:" + r2.calculatePerimeter());
        System.out.println("----------------------------------------");
    }
    void problem2(){
        Invoice Inv1= new Invoice();
        Invoice Inv2= new Invoice("H123","Hammer",5,15.99);
        System.out.println("----------------------------------------");
        System.out.println("Part Number:" + Inv1.getPartNumber());
        System.out.println("Description:" + Inv1.getPartDescription());
        System.out.println("Quantity:" + Inv1.getQuantity());
        System.out.println("Price Per Item:" + Inv1.getPricePerItem());
        System.out.println("Invoice:" + Inv1.calculateInvoice());
        System.out.println("----------------------------------------");
        System.out.println("Part Number:" + Inv2.getPartNumber());
        System.out.println("Description:" + Inv2.getPartDescription());
        System.out.println("Quantity:" + Inv2.getQuantity());
        System.out.println("Price Per Item:" + Inv2.getPricePerItem());
        System.out.println("Invoice:" + Inv2.calculateInvoice());
        System.out.println("----------------------------------------");
    }
}