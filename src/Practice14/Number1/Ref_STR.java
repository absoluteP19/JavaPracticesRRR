package Practice14.Number1;
//Необходимо реализовать консольное приложение, позволяющее
//        манипулировать строкой, разбив ее на элементы путем использования
//        регулярных выражений.
import java.util.Arrays;
import java.util.Scanner;

public class Ref_STR {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Введите паттерн: ");
        String p = sc.nextLine();
        System.out.println(Arrays.toString(str.split(p)));
    }
}