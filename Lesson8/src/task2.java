import java.util.Scanner;

public class task2 {

    static  int num = 0;
    static boolean a = true;
    public static void main(String[] args) {
        //Написать программу, в которой пользователь вводит целое число.
        //Если число четное, то печатаем true, если не четное, печатаем false
        //В методе main НЕ ДОПУСТИМО написание какого либо кода, кроме вызова методов.
        //Методы и их логику продумайте сами

        num = inputNumber();
        checkNum(); // МОЖНО БЫЛО ОБОЙТИСЬ ОДНОЙ СТРОКОЙ!!!




    }

    private  static int inputNumber() {
        System.out.println("Введите целое число: ");
        return new Scanner(System.in).nextInt();
    }
        private static void checkNum() {   // System.out.println(num % 2 == 0 ? true : false) ТЕРНАРНЫЙ СПОСОБ ЗАПИСИ
            if (num % 2 == 0) {
                System.out.println(a);  // System.out.println(num % 2 == 0)   УПРОЩЕННЫЙ СПОСОБ. вернет либо true либо false
            }                           // System.out.println(inputNumber() % 2 == 0);  // МЕТОД В МЕТОДЕ!
            else {
                a = false;
                System.out.println(a);
            }
        }
}

