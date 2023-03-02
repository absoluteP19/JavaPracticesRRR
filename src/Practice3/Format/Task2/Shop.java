package Practice3.Format.Task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Shop {
    private static Product[] stock;
    private static Scanner sc;

    public static void main(String[] args) {
        init();
        printStock();
        System.out.println("Enter index of tovar");
        int ind = sc.nextInt();
        Product t = getTovar(ind);
        System.out.println("Chosen tovar is " + t);
        System.out.println("Enter valute");
        System.out.println(Product.ratios.keySet());
        String valute = sc.next();
        t.setValute(valute);
        System.out.println("Cost of tovar is " + t.getCost() + " " + t.getValute());
    }

    private static Product getTovar(int i) {
        return stock[i];
    }

    private static void printStock() {
        System.out.println("Stock is: ");
        for (Product tovar : stock) {
            System.out.println("   " + tovar);
        }
        System.out.println();
    }

    private static void init() {
        stock = new Product[3];
        stock[0] = new Product(10.0, "banan", "dub");
        stock[1] = new Product(20.0, "apple");
        stock[2] = new Product(30.0, "spoon");

        sc = new Scanner(System.in);
    }
}