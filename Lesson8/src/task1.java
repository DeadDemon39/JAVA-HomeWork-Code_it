import java.util.Scanner;

public class task1 {
    static double a = 0;
    static double b = 0;

    public static void main(String[] args) {


        //todo Вам нужно дополнить методы так, чтобы получился рабочий калькулятор
        a = inputDouble();
        b = inputDouble();


        calculator();
    }



    public static void calculator() {
        System.out.println("1 - сложение\n2 - вычитание\n3 - умножение\n4 - деление");
        int command = new Scanner(System.in).nextInt();

        if (command == 1) {
            sum();
        } else if (command == 2) {
            diff();
        } else if (command == 3) {
            multiply();
        } else if (command == 4) {
            divide();
        } else {
            System.out.println("Ввели некоректную команду!");
        }
    }

    private static void divide() {
        //todo дописать логику и печать результата
        System.out.println("Деление чисел = " + (a / b));
    }

    private static void diff() {
        //todo дописать логику и печать результата
        System.out.println("Разница чисел = " + (a - b));
    }

    private static void multiply() {
        //todo дописать логику и печать результата
        System.out.println("Произведение чисел = " + (a * b));
    }

    private static void sum() {
        //todo дописать логику и печать результата
        System.out.println("Сумма чисел = " + (a + b));
    }

    private static double inputDouble() {
        System.out.println("Введите число: ");
        return new Scanner(System.in).nextDouble();
    }


}