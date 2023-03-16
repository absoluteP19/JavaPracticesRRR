package Practice10;

//Создать свой класс Student со всеми переменными экземпляра,
//        конструктором, включающим все переменные, предпочтительно
//        использовать геттеры и сеттеры для каждой переменной. Класс студент
//        имеет свойства: Имя, Фамилия, Специальность, Курс, Группа


public class Student {
    private String firstName;
    private String lastName;
    private String speciality;
    private int course;
    private String group;
    private int gpa;

    public Student(String firstName, String lastName, String speciality, int course, String group, int gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.speciality = speciality;
        this.course = course;
        this.group = group;
        this.gpa = gpa;
    }

    public int getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", speciality='" + speciality + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}