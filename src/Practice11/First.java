package Practice11;

//Написать программу, выводящую фамилию разработчика, дату и
//        время получения задания, а также дату и время сдачи задания. Для
//        получения последней даты и времени использовать класс Date из пакета
//        java.util.* (Объявление Dated=newDate() или метод
//        System.currentTimeMillis().

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class First {
    public static void main(String[] args) {
        Calendar c1 = Calendar.getInstance();
        c1.set(2022, Calendar.SEPTEMBER, 1);

        System.out.println("Task received  Proshkin-" + c1.get(Calendar.YEAR) + " " + c1.get(Calendar.MONTH));
        System.out.println("Task completed Proshkin-" + new Date());
    }
}