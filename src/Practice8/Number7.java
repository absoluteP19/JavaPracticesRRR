package Practice8;

import java.util.Scanner;

/*
Задание Разложение на множители
Дано натуральное число n>1. Выведите все простые множители этого
числа в порядке не убывания с учетом кратности. Алгоритм должен иметь
сложность O(logn)

 */
public class Number7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        check(sc.nextInt(), 2);
    }

    public static void check(int n, int div) {
        if (n == 1) {
            return;
        }
        if (n < div * div) {
            System.out.println(n + " 1");
            return;
        }
        int c = 0;
        while (n % div == 0) {
            n/=div;
            c++;
        }
        if (c > 0)
            System.out.println(div + " " + c);
        check(n, div + 1);
    }
}