package Practice14.Number7;
//Проверить, надежно ли составлен пароль. Пароль считается
//        надежным, если он состоит из 8 или более символов. Где символом
//        может быть цифр, английская буква, и знак подчеркивания. Пароль
//        должен содержать хотя бы одну заглавную букву, одну маленькую
//        букву и одну цифру.
//        a) пример правильных выражений: F032_Password,
//        TrySpy1.
//        b) пример неправильных выражений: smart_pass, A007.
import java.util.regex.Pattern;

public class Password {

    public static boolean checkPass(String s){
        return Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z_]{8,}").matcher(s).find();
    }

    public static void main(String [] args){
        System.out.println();
        System.out.println(checkPass("F032_Password"));
        System.out.println(checkPass("qoejqQWEkmkeq123"));

        System.out.println(checkPass("smart_pass"));
        System.out.println(checkPass("A007"));
    }
}