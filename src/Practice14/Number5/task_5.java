package Practice14.Number5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Написать регулярное выражение, определяющее является ли данная
//        строчка датой в формате dd/mm/yyyy. Начиная с 1900 года до 9999
//        года.
//        a) пример правильных выражений: 29/02/2000, 30/04/2003,
//        01/01/2003.
//        b) пример неправильных выражений: 29/02/2001, 30-04-2003,
//        1/1/1899.
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task_5 {
    public static void main(String[] args) {
        String regex = "(([0-2]\\d)|(3[01]))/[01]\\d/[1-9]\\d{3}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher("29/02/2000, 30/04/2003, 01/01/2003, 30-04-2003, 1/1/1899");
        System.out.println("String: 29/02/2000, 30/04/2003, 01/01/2003, 30-04-2003, 1/1/1899");
        System.out.println("Regex: (([0-2]\\d)|(3[01]))/[01]\\d/[1-9]\\d{3}");
        while (matcher.find())
            System.out.println(matcher.group());
    }
}