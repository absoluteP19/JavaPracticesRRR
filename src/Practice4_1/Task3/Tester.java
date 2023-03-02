package Practice4_1.Task3;

public class Tester {
    public static void main(String[] args) {
        Person a = new Person();
        Person b = new Person("Petr", 23);

        a.move();
        a.talk();

        b.move();
        b.talk();
    }
}