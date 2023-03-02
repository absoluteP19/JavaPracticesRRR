package Practice6;

import Practice6.Application.Printable;

public class Shop implements Printable {

    @Override
    public String toString() {
        return "Im a shop";
    }

    @Override
    public void print() {
        System.out.println(this.toString());
    }
}