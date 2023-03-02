package Practice1.Task2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import static java.lang.Math.max;
import static java.lang.Math.min;



public class Cycles {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array ");
        int size = scanner.nextInt();
        List<Integer> array = new ArrayList<>();
        int sum1 = 0, sum2 = 0, sum3 = 0;
        for(int index =0 ; index < size; index++) {
            array.add(scanner.nextInt());
            sum1 += array.get(index);

        }
        int min_el = array.get(0);
        int max_el = array.get(0);

        int size2 = size;
        while (--size2 >= 0) {
            sum2 += array.get(size2);
            min_el = min(min_el, array.get(size2));
            max_el = max(max_el, array.get(size2));
        }

        size2 = size;
        do {
            sum3 += array.get(size2-1);
        } while(--size2>0);

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(min_el + " " + max_el);
    }
}

