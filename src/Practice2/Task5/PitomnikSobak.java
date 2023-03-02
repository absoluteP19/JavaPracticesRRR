package Practice2.Task5;
import java.util.ArrayList;
import java.util.Scanner;
public class PitomnikSobak {
    private static Scanner scanner;

    public static Dog input() {
        System.out.println("Enter dog name and dog age");
        String name = scanner.next();
        int age = scanner.nextInt();
        return new Dog(name, age);
    }

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        ArrayList<Dog> pitomnik = new ArrayList<>();
        int n = scanner.nextInt();
        pitomnik.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            pitomnik.add(input());
        }
        System.out.println(pitomnik);

        while(true) {
            System.out.println("Enter 1 if you want to add a dog\n" +
                    "Enter 2 if you want to get a dog");
            int op = scanner.nextInt();
            switch (op) {
                case 1:
                    pitomnik.add(input());
                    System.out.println(pitomnik);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Enter an index of a dog");
                    int ind = scanner.nextInt();
                    System.out.println(pitomnik.get(ind));
                    System.out.println();
                    break;
            }
        }
    }
}
