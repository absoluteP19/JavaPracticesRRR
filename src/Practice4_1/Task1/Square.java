package Practice4_1.Task1;

public class Square extends Shape{
    private Double a;

    public Square(Double a) {
        this.a = a;
    }

    @Override
    public Double getArea() {
        return a * a;
    }

    @Override
    public Double getPerimeter() {
        return 4 * a;
    }

    @Override
    public String getType() {
        return "Square";
    }

    @Override
    public String toString() {
        return "Square with side a=" + a;
    }
}
