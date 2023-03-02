package Practice2.Task8;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] str = new String[size];
        for (int i = 0; i < size; ++i) {
            str[i] = sc.next();
        }
        for (int i = 0; i < size / 2; ++i) {
            String mid = str[i];
            str[i] = str[size-i-1];
            str[size-i-1] = mid;
        }
        System.out.println(Arrays.toString(str));
    }
}

