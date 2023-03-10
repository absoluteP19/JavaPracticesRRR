package Practice8;


/*
Задание Заданная сумма цифр
Даны натуральные числа k и s. Определите, сколько существует kзначных натуральных чисел, сумма цифр которых равна d. Запись
натурального числа неможет начинаться с цифры 0.
В этой задаче можно использовать цикл для перебора всех цифр,
стоящихна какой-либо позиции.
*/

import java.util.Scanner;

public class Number4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int s = scanner.nextInt();
        System.out.println(count(0, k, 0, s));
    }

    public static int count(int pos, int k, int sum, int s) {
        if (pos == k) {
            if (sum == s) {
                return 1;
            }
            return 0;
        }
        int ans = 0;
        for (int i = 0; i < 10; ++i) {
            if (i == 0 && pos == 0) {
                continue;
            }
            ans += count(pos + 1, k, sum + i, s);
        }
        return ans;
    }
}