package Practice4.Task2;

public class Studio {
    public static void main(String[] args) {
        Clothes[] clothes = new Clothes[4];
        clothes[0] = new Pants();
        clothes[1] = new Shirt();
        clothes[2] = new Tie();
        clothes[3] = new TShirt();

        dressMen(clothes);

        System.out.println();

        dressWoman(clothes);
    }

    public static void dressMen (Clothes[] clothes) {
        for (int i = 0; i < clothes.length; ++i) {
            if (clothes[i] instanceof MenClothing) {
                ((MenClothing) clothes[i]).dressMan();
            }
        }
    }

    public static void dressWoman (Clothes[] clothes) {
        for (int i = 0; i < clothes.length; ++i) {
            if (clothes[i] instanceof WomanClothing) {
                ((WomanClothing) clothes[i]).dressWoman();
            }
        }
    }
}