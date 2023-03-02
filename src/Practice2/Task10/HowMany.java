package Practice2.Task10;
import java.util.Scanner;


public class HowMany {
    public static void main(String[] args) {
        int cnt = 0;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            cnt++;
            scanner.next();
        }
        System.out.println(cnt);
    }
}