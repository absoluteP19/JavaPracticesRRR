package Practice14.Number4;
//Дан текст, необходимо проверить есть ли в тексте цифры, за
//        которыми не стоит знак «+».
//        a) пример правильных выражений:(1 + 8) – 9 / 4
//        b) пример неправильных выражений: 6 / 5 – 2 * 9
import java.util.regex.Pattern;

public class Plus {

    public static boolean isPlus(String s){
        return Pattern.compile("\\d+\\s*\\+").matcher(s).find();
    }

    public static void main(String [] args) {
        System.out.println(isPlus("(1 / 3) - 5"));
        System.out.println(isPlus("1 + 3 -5"));
    }
}