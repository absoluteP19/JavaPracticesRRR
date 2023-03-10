package Practice13.Task2;
//Разработать класс Person, в котором имеется
//        функция, возвращающая Фамилию И.О. Функция должна учитывать
//        возможность отсутствия значений в полях Имя и Отчество. Программу
//        оптимизировать с точки зрения быстродействия.
public class Person {
    private String name;
    private final String surname;
    private String patronymic;

    public Person(String surname) {
        this.surname = surname;
    }

    public Person(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public String getFio(){
        StringBuilder fio = new StringBuilder(surname);
        if(name != null && ! name.equals(""))
            fio.append(" ").append(name);
        if(patronymic != null && ! patronymic.equals(""))
            fio.append(" ").append(patronymic);
        return fio.toString();
    }

    public static void main(String[] args) {
        Person p1 = new Person("Прошкин");
        Person p2 = new Person("Антон", "Прошкин", "");
        Person p3 = new Person("Антон", "Прошкин", "Владимирович");
        System.out.println(p1.getFio());
        System.out.println(p2.getFio());
        System.out.println(p3.getFio());
    }
}