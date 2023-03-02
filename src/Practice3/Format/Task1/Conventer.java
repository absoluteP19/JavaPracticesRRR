package Practice3.Format.Task1;

import java.util.Scanner;

public class Conventer {
    public static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        while(true) {
            receive();
        }
    }

    public static void receive() {
        int cost1, cost2, count;
        cost1 = getValue("Enter a cost of first valute: ");
        cost2 = getValue("Enter a cost of second valute: ");
        count = getValue("Enter an amount: ");
        System.out.println(count + " in second valute is " + count * (cost1 * 1.0 / cost2));
    }

    public static int getValue(String message) {
        System.out.print(message);
        int t = sc.nextInt();
        System.out.println();
        return t;
    }

}