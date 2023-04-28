/*
* Написать программу, которая сгенерирует случайный вес 10 людям в пределах от 40 до 100 кг.
* (Нужно самостоятельно найти информацию, как генерировать числа в заданном диапазоне).

* Далее вам нужно будет вычислить несколько показателей:
* 1. Средний вес всех людей.
* 2. Количество людей у которых вес находится в промежутке от 60 до 80 кг включительно.

 */


import java.util.Random;
//
//public class task2 {
//    public static void main(String[] args) {
//
//        double[] weights = new double[10];
//
//        for (int i = 0; i < weights.length; i++) {
//
////          <       мин значение                      >   макс значение
//            weights[i] = (new Random().nextDouble() * 60) + 40;
//        }
//        double middleWeight = 0;
//        for (int i = 0; i < weights.length; i++) {
//            middleWeight += weights[i];
//        }
//        int peopleCount = 0;
//        for (int i = 0; i < weights.length; i++) {
//            if (weights[i] >= 60 && weights[i] <= 80){
//                peopleCount++;
//            }
//
//        }
//        System.out.println("Средний вес всех людей = " + (middleWeight / weights.length));
//        System.out.println("Кол-во людей: = " + peopleCount);
//
//
//    // ЗАПИСЬ ВСЕГО ЭТОГО ТОЛЬКО КОРОЧЕ!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//
//
//    }
//
//}
public class task2 {
    public static void main(String[] args) {


    double[] weights = new double[10];
    double middleWeight = 0;
    int peopleCount = 0;



        for (int i = 0; i < weights.length; i++) {
            weights[i] = (new Random().nextDouble() * 60) + 40;
        }

        for (int i = 0; i < weights.length; i++) {
            middleWeight += weights[i];
            if (weights[i] >= 60 && weights[i] <= 80) {
                peopleCount++;
            }
        }
        System.out.println("Средний вес всех людей = " + (middleWeight / weights.length));
        System.out.println("Кол-во людей: = " + peopleCount);




    }
}