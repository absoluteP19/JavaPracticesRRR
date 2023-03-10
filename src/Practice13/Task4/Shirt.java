package Practice13.Task4;
//Реализуйте класс Shirt: Метод toString() выводит
//        объяснение и значение полей построчно.
//        Дан также строковый массив: shirts[0] = "S001,Black Polo
//        Shirt,Black,XL"; shirts[1] = "S002,Black Polo Shirt,Black,L"; shirts[2] =
//        "S003,Blue Polo Shirt,Blue,XL"; shirts[3] = "S004,Blue Polo Shirt,Blue,M";
//        shirts[4] = "S005,Tan Polo Shirt,Tan,XL"; shirts[5] = "S006,Black TShirt,Black,XL"; shirts[6] = "S007,White T-Shirt,White,XL"; shirts[7] =
//        "S008,White T-Shirt,White,L"; shirts[8] = "S009,Green T-Shirt,Green,S";
//        shirts[9] = "S010,Orange T-Shirt,Orange,S"; shirts[10] = "S011,Maroon Polo
//        Shirt,Maroon,S";
//        Преобразуйте строковый массив в массив класса Shirt и выведите его
//        на консоль.

public class Shirt {
    final private String num, fullName, color, size;

    public Shirt(String values){
        String[] s = values.split(",");
        num = s[0];
        fullName = s[1];
        color = s[2];
        size = s[3];
    }

    @Override
    public String toString() {
        return "Shirt:" +
                "\n\tarticle='" + num +
                "\n\tfullName='" + fullName +
                "\n\tcolor='" + color +
                "\n\tsize='" + size;
    }

    public static void main(String [] args){
        String[] values = new String[]{
                "S001,Black Polo Shirt,Black,XL",
                "S002,Black Polo Shirt,Black,L",
                "S003,Blue Polo Shirt,Blue,XL",
                "S004,Blue Polo Shirt,Blue,M",
                "S005,Tan Polo Shirt,Tan,XL",
                "S006,Black T-Shirt,Black,XL",
                "S007,White T-Shirt,White,XL",
                "S008,White T-Shirt,White,L",
                "S009,Green T-Shirt,Green,S",
                "S010,Orange T-Shirt,Orange,S",
                "S011,Maroon Polo Shirt,Maroon,S"
        };

        Shirt[] ans = new Shirt[values.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = new Shirt(values[i]);
            System.out.println(ans[i]);
        }
    }
}