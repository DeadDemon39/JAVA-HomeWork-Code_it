import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Введите любое целое не отрицательное число: ");
        int input = new Scanner(System.in).nextInt();
        System.out.println(avg(input));
    }


    public static double avg(int num) {
        String num1 = String.valueOf(num);
       double result = 0;

        for (int i = 0; i < num1.length(); i++) {
            result += Double.parseDouble(String.valueOf(num1.charAt(i)));
        }
        return result / num1.length();
    }
}