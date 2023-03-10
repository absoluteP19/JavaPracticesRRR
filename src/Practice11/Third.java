package Practice11;
//Доработайте класс Student предусмотрите поле для хранения даты
//        рождения, перепишите метод toString() таким образом, чтобы он
//        разработайте метод, возвращал строковое представление даты рождения по
//        вводимому в метод формату даты (например, короткий, средний и полный
//        формат даты).
import java.text.SimpleDateFormat;
import java.util.Date;

public class Third {
    Date date;
    String name;
    Third(String name, Date date){
        this.name = name;
        this.date = date;
    }

    public String toString(int choice){
        String[] patterns = {	"yyyy.MM.dd",
                "dd.MM.yy GGG",
                "EEE, d MMM yyyy"
        };
        return "Cтудент: " + name + "\nДата рождения: " + new SimpleDateFormat(patterns[choice - 1]).format(date);
    }
}