package Practice3.MathRandom.Task3;

import java.util.Arrays;

public class Arrayer {
    public static void main(String[] args) {
        Double[] seq = new Double[4];
        for (int i = 0; i < 4; ++i) {
            seq[i] = Math.floor(Math.random() * 89 + 10);
        }
        System.out.println(Arrays.toString(seq));
        boolean flag = true;
        for (int i = 1; i < 4; ++i) {
            if (Double.compare(seq[i-1], seq[i]) != 1) {
                flag = false;
            }
        }
        System.out.println(flag);
    }
}