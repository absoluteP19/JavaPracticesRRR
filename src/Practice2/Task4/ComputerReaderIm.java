package Practice2.Task4;

import java.util.ArrayList;
import java.util.Scanner;

public class ComputerReaderIm implements ComputerReader {
    @Override
    public ArrayList<Computer> read() {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        ArrayList<Computer> res = new ArrayList<>();
        res.ensureCapacity(size);
        for (int i = 0; i < size; ++i) {
            String name = scanner.next();
            res.add(new Computer(name));
        }
        return res;
    }

}
