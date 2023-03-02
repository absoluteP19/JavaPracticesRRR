package Practice2.Task3;

import java.util.Arrays;


public class CirlceTest {
    public static void main(String[] args) {
        Circle circle = new Circle(new Point(), 2);
        Circle[] array = new Circle[3];
        array[0] = circle;
        array[1] = new Circle(new Point(1, 2), 2);
        array[2] = new Circle(new Point(2, 2), 2);
        System.out.println(circle);
        System.out.println(Arrays.toString(array));
    }
}
