package Practice14.Number6;
//Написать регулярное выражение, определяющее является ли данная
//        строчка допустимым (корректным) е-mail адресом согласно RFC под
//        номером 2822.
//        a) пример правильных выражений: user@example.com,
//        root@localhost
//b) пример неправильных выражений: myhost@@@com.ru,
//@my.ru, Julia String.
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task_6 {
    public static void main(String[] args) {
        String regex = "[\\w\\-_\\.+]*[\\w\\-_\\.]+\\@([\\w]+\\.)*[\\w]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher("user@example.com, root@localhost, myhost@@@com.ru");
        System.out.println("String: user@example.com, root@localhost, myhost@@@com.ru");
        System.out.println("Regex: [\\w\\-_\\.+]*[\\w\\-_\\.]+\\@([\\w]+\\.)*[\\w]+");
        while (matcher.find())
            System.out.println(matcher.group());
    }
}