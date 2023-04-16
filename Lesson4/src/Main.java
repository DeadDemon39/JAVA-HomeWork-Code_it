import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        int a = 1;
//        int b = 2;
//
//        int numberC = 3;
//        int numberD = 4;
//        int numberF = 5;
//
//        String word = "new";
//        char ab = 'a';
//        char bc = 'b';
//
//        int num = 10;
//        double num1 = 3.14;
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(numberC);
//        System.out.println(numberD);
//        System.out.println(numberF);
//        System.out.println(word);
//        System.out.println(ab);
//        System.out.println(bc);
//        System.out.println(num);
//        System.out.println(num1);


//        System.out.println("калькулятор суммы чисел");
//        System.out.println("Введите первое число:");
//        int a = new Scanner(System.in).nextInt();
//        System.out.println("Введите второе число:");
//        int b = new Scanner(System.in).nextInt();
//
//        System.out.println(a + " + " + b + " = " + (a + b));
//
//        System.out.println("калькулятор разности  чисел");
//        System.out.println("Введите первое число:");
//        int ab = new Scanner(System.in).nextInt();
//        System.out.println("Введите второе число:");
//        int bc = new Scanner(System.in).nextInt();
//
//        System.out.println(ab + " - " + bc + " = " + (ab - bc));
//
//
//        System.out.println("калькулятор частного чисел");
//        System.out.println("Введите первое число:");
//        int ar = new Scanner(System.in).nextInt();
//        System.out.println("Введите второе число:");
//        int br = new Scanner(System.in).nextInt();
//
//        System.out.println(ar + " / " + br + " = " + (ar / br));


//        System.out.println("калькулятор суммы чисел");
//        System.out.println("Введите первое число:");
//        double a = new Scanner(System.in).nextDouble();
//        System.out.println("Введите второе число:");
//        double b = new Scanner(System.in).nextDouble();
//
//        System.out.println(a + " + " + b + " = " + (a + b));
//
//        System.out.println("калькулятор разности  чисел");
//        System.out.println("Введите первое число:");
//        double ab = new Scanner(System.in).nextDouble();
//        System.out.println("Введите второе число:");
//        double bc = new Scanner(System.in).nextDouble();
//
//        System.out.println(ab + " - " + bc + " = " + (ab - bc));
//
//
//        System.out.println("калькулятор частного чисел");
//        System.out.println("Введите первое число:");
//        double ar = new Scanner(System.in).nextDouble();
//        System.out.println("Введите второе число:");
//        double br = new Scanner(System.in).nextDouble();
//
//        System.out.println(ar + " / " + br + " = " + (ar / br));


//        System.out.println("\t\t***Конвертер валют***");
//        System.out.println("Введите сумму которую необходимо конвертировать: ");
//        double a = new Scanner(System.in).nextDouble();
//        double dollars = a * (1 / 56.34);
//        double euro = a * (1 / 75.10);
//
//        System.out.println(a + " рублей" + " = " + dollars + "-долларов \n" + a + " рублей" + " = " + euro + "-евро");


        System.out.println("\t\t***Конвертер температуры***");
        System.out.println("Введите показания температуры в цельсиях: ");
        double temp = new Scanner(System.in).nextDouble();
        double tempFar = temp * 1.8 + 32;

        System.out.println(temp + "C " + " По фаренгейту = " + tempFar);


    }
}