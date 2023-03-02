package Practice6;

import Practice6.Application.Printable;

public class Book implements Printable {

    @Override
    public String toString() {
        return "Im a book";
    }

    @Override
    public void print() {
        System.out.println(this.toString());
    }
}