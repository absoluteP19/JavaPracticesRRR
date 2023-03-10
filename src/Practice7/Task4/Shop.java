package Practice7.Task4;

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

    public static void printMagazines(Printable[] printables) {
        System.out.println("Magazines:");
        for (Printable i : printables) {
            if (i instanceof Shop) {
                System.out.println(i);
            }
        }
        System.out.println();
    }
}