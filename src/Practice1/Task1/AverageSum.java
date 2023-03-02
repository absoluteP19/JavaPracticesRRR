package Practice1.Task1;

import java.sql.SQLOutput;
import java.util.Scanner;


public class AverageSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array  = new int[size];
        int sum = 0;
        for (int i = 0; i < size; ++i) {
            array[i] = scanner.nextInt();
            sum += array[i];
        }
        System.out.println(sum);
        System.out.println(sum * 1.0 / size);
    }
}
