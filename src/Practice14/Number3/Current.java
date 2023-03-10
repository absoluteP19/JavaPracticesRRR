package Practice14.Number3;
//Дан текст со списками цен. Извлечь из него цены в USD, RUВ, EU.
//        a) пример правильных выражений: 25.98 USD.
//        b) пример неправильных выражений: 44 ERR, 0.004 EU.
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Current {

    public static ArrayList<String> findRubEurUsd(String s){
        Pattern p  = Pattern.compile("\\d+(\\.\\d+)?\\s?((USD)|(EUR)|(RUB))");
        Matcher m = p.matcher(s);
        ArrayList<String> ans = new ArrayList<>();
        while (m.find()){
            ans.add(m.group());
        }
        return ans;
    }
    // 1239.98 USD
// 9472 ERR, 00123 EU
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String value = scan.nextLine();
        ArrayList<String> ans = findRubEurUsd(value);
        if (ans.size() == 0) {
            System.out.println("\nНеправильные значения");
        }
        else {
            System.out.println(ans);
        }

    }
}