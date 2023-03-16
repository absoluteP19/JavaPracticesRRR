package Practice14.Number2;
//Написать регулярное выражение, определяющее является ли данная
//        строка строкой "abcdefghijklmnopqrstuv18340" или нет.
//        a) пример правильных выражений: abcdefghijklmnopqrstuv18340
//        b) пример неправильных выражений:
//        abcdefghijklmnoasdfasdpqrstuv18340.

public class task_2 {
    public static void main(String[] args) {
        System.out.println("\"abcdefghijklmnopqrstuv18340\": " + "abcdefghijklmnopqrstuv18340".matches("^abcdefghijklmnopqrstuv18340$"));
        System.out.println("\"abcdefghijklmnoasdfasdpqrstuv18340\": " + "abcdefghijklmnoasdfasdpqrstuv18340".matches("^abcdefghijklmnopqrstuv18340$"));
    }
}