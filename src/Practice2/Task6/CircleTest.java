package Practice2.Task6;
import Practice2.Task3.Point;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(new Point(), 2);
        Circle circle2 = new Circle(new Point(1, 0), 2);
        System.out.println("circle is " + circle);
        System.out.println("circle2 is " + circle2);
        System.out.println("length of c is " + circle.evaluateLength());
        System.out.println("area of c is " + circle.evaluateArea());
        System.out.println("c2 is equal c is " + circle2.equals(circle));
    }
}
