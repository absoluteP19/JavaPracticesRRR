package Practice4.Task2;

public class Shirt extends Clothes implements WomanClothing{
    @Override
    public void dressWoman() {
        System.out.println("Its skirt for woman");
    }
}
