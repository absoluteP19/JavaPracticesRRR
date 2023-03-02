package Practice4_1.Task5;

import java.time.Instant;

public class Tester {
    public static void main(String[] args) {
        Reader reader = new Reader("Vasya", 1, "PI", Instant.now(), 792309234);
        reader.takeBook("a", "b");
        reader.takeBook(3);

        reader.returnBook("a", "b");
        reader.returnBook(3);
    }

}