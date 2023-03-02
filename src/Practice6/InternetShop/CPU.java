package Practice6.InternetShop;

public class CPU {
    Mark mark;

    CPU() {
        mark = Mark.INTEL;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "mark=" + mark +
                '}';
    }
}