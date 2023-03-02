package Practice1.Task5;


import java.util.Scanner;

public class Factorial {
    public static int factorial(int number){
        int result = 1;
        if(number == 0 || number == 1){
            return result;
        }
        result = number * factorial(number - 1);
        return result;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scanner.nextInt();
        System.out.println(factorial(number));
    }
}
