package Practice13.Task1;
//
//Напишите метод, который принимает в качестве параметра
//        любую строку, например “I like Java!!!”.
//        2. Распечатать последний символ строки. Используем метод
//        String.charAt().
//        3. Проверить, заканчивается ли ваша строка подстрокой “!!!”.
//        Используем метод String.endsWith().
//        4. Проверить, начинается ли ваша строка подстрокой “I like”.
//        Используем метод String.startsWith().
//        5. Проверить, содержит ли ваша строка подстроку “Java”.
//        Используем метод String.contains().
//        6. Найти позицию подстроки “Java” в строке “I like Java!!!”.
//        7. Заменить все символы “а” на “о”.
//        8. Преобразуйте строку к верхнему регистру.
//        9. Преобразуйте строку к нижнему регистру.
//        10. Вырезать строку Java c помощью метода String.substring().

import java.util.Scanner;

public class Strings {
    public static void main(String [] args){
        System.out.println("Введите строку: ");
        Scanner scan = new Scanner(System.in);
        String value;
        value = scan.nextLine();
        System.out.println("1. Строка пользователя: " + value + "\n");

        System.out.println("2. Последний символ: " + value.charAt(value.length() - 1) + "\n");

        if (value.endsWith("!!!"))
            System.out.println("3. Строка заканчивается на !!! \n");
        else System.out.println("3. Строка не заканчивается на !!! \n");

        if (value.startsWith("I like"))
            System.out.println("4. Строка начинается с I like\n");
        else System.out.println("4. Строка не начинается с I like\n");

        if (value.contains("Java"))
            System.out.println("5. Строка содержит Java\n");
        else System.out.println("5. Строка не содержит Java\n");

        if (value.contains("Java")){
            int position = value.indexOf("Java");
            System.out.println("6. Позиция: " + position + "\n");
        }
        else System.out.println("6. Строка не содержит Java\n");

        System.out.println("7. Преобразованная строка: " + value.replace('a', 'o' ) + "\n");

        System.out.println("8. Строка в верхнем регистре: " + value.toUpperCase() + "\n");
        System.out.println("9. Строка в нижнем регистре: " + value.toLowerCase() + "\n");
        //System.out.println("Позиция подстроки: " + value.indexOf("I like Java!!!") + "\n");

        if (value.contains("Java")){
            int position = value.indexOf("Java");
            System.out.println("10. Новая строка: " + value.substring(0, position) + value.substring(position + 4) + "\n");
        }
        else System.out.println("10. Строка не содержит Java\n");

    }
}
