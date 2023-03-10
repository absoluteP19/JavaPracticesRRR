package Practice8;

import java.util.Scanner;

/*
Задание Проверка числа на простоту
Дано натуральное число n>1. Проверьте, является ли оно простым.
Программа должна вывести слово YES, если число простое и NO, если
число составное. Алгоритм должен иметь сложность O(logn).
 */
public class Number6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (isPrime(n, 2)) {
               System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean isPrime(int n, int i) {
        if (n <= 2) {
            return (n == 2) ? true : false;
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }
        return isPrime(n, i + 1);
    }
}
