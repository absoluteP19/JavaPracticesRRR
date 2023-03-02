package Practice3.MathRandom.Task4;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class RandomArray {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int size = input();
        int size2 = 0;
        int[] array = new int[size];
        for (int i = 0; i < size; ++i) {
            array[i] = (int) (Math.random() * size);
            size2 += 1 - array[i] % 2;
        }
        System.out.println(Arrays.toString(array));

        int[] ar2 = new int[size2];
        for (int i = 0; i < size; ++i) {
            if (array[i] % 2 == 0) {
                ar2[--size2] = array[i];
            }
        }
        System.out.println(Arrays.toString(ar2));
    }

    public static int input() {
        System.out.println("Enter please a valid natural numberd");
        int n = scanner.nextInt();
        return n > 0 ? n : input();
    }
}