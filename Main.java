public class Main {
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
    public static void main(String[] args) {
        Main m = new Main();
        m.problem1();
        m.problem2();
        }
}