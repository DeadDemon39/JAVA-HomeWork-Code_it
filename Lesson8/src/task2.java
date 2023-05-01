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
        checkNum();




    }

    private  static int inputNumber() {
        System.out.println("Введите целое число: ");
        return new Scanner(System.in).nextInt();
    }
        private static void checkNum() {
            if (num % 2 == 0) {
                System.out.println(a);
            }
            else {
                a = false;
                System.out.println(a);
            }
        }
}

