package Practice8;

import java.util.Scanner;


/*
Задание Сумма цифр числа
Дано натуральное число N. Вычислите сумму его цифр. При решении
этой задачи нельзя использовать строки, списки, массивы (ну и циклы,
разумеется).

 */
public class Number5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
    }

    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sum(n/10);
    }
}