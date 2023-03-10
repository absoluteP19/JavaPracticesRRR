package Practice11;

//Приложение, сравнивающее текущую дату и дату, введенную
//        пользователем c текущим системным временем


import java.time.LocalDate;
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate nw = LocalDate.now();
        String s = sc.next();
        LocalDate d = LocalDate.parse(s);
        if (nw.isEqual(d)) {
            System.out.println("Dates are equal");
        }
        else {
            System.out.println("Dates arent equal");
        }
    }
}