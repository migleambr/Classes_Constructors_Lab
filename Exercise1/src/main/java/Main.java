import org.w3c.dom.css.Rect;

public class Main {

    public static void main(String[] args) {

        Circle circle1 = new Circle(5.5);
        System.out.println(circle1.getCircumference());

        circle1.setRadius(2.5);
        System.out.println(circle1.getCircumference());

        System.out.println("-----");

        Rectangle rectangle1 = new Rectangle(2.0, 3.0);
        System.out.println(rectangle1.getPerimeter());
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getDiagonal());

        System.out.println("-----");

        Customer customer1 = new Customer(1, "Migle", "Ambrazeviciute", 1000.0);
        System.out.println(customer1.getFullName());
        customer1.subtractMoneyHeld(300.0);

    }

}
