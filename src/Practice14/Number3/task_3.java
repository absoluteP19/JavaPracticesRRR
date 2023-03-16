package Practice14.Number3;
//Дан текст со списками цен. Извлечь из него цены в USD, RUВ, EU.
//        a) пример правильных выражений: 25.98 USD.
//        b) пример неправильных выражений: 44 ERR, 0.004 EU.


    // 1239.98 USD
// 9472 ERR, 00123 EU
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task_3 {
    public static void main(String[] args) {
        String regex = "(\\d+\\.?\\d*\\s)(RUB|USD|EU)";
        String s = "Цены 30.06 USD 50.30 RUB 60.12 CHF 11,23" ;
        Pattern p1 = Pattern. compile(regex);
        Matcher m1 = p1.matcher(s);
        while (m1.find()) {
            System.out.println("Список цен: " + m1.group());}
    }
}