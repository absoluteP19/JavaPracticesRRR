package Practice2.Task4;

public class ShopTest {
    public static void main(String[] args) {
        Shop tst = new Shop();
        System.out.println(tst.findComputer("kek"));
        tst.removeComputer("kek");
        System.out.println(tst.findComputer("kek"));
        tst.addComputer("kek");
        System.out.println(tst.findComputer("kek"));
    }
}
