/*
* Представьте(Ха-ха), что началась война, и ваша IT компания вынуждена сократить штат айтишников вдвое.
* Всего в компании 100 айтишников. Каждому из них присвоен id от 1 до 100 соответственно. Ваша задача:
* Написать программу, которая будет печатать id каждого второго айтишника так:

  “Уволен айтишник с id 2”
  “Уволен айтишник с id 4”
  “Уволен айтишник с id 6”
… РЕШИТЬ ЗАДАЧУ ИСПОЛЬЗУЯ ТОЛЬКО ЦИКЛ WHILE()!!!!!!!!!!!!!!!!!!!!!!

 */


public class task3 {
    public static void main(String[] args) {

        boolean ok = true;
        int i = 1;

        while (ok) {
            if (i % 2 != 0 && i <= 100) {
                i++;
            } else if (i % 2 == 0 && i <= 100) {
                System.out.println("\"Уволен айтишник с id " + i +("\""));
                i++;
            } else  {
                ok = false;
            }
        }
    }
}



