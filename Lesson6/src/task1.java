import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/*
* В первом задании вам будет нужно создать программу, в которой пользователь примет участие в составлении волшебных эликсиров.
* Суть программы в следующем: Есть рецепты эликсиров, есть ингредиенты, количество которых вводит пользователь.
* Нужно показать пользователю, какие эликсиры с введенным кол-вом ингредиентов он сможет изготовить.
* Если пользователю не хватает ингредиентов ни на один эликсир, то необходимо как то об этом сообщить.
 */

public class task1 {
    public static void main(String[] args) {


//        int toadEyesCount            //Жабьи глаза
//        int ghoulTearsCount          //Слезы вурдалака
//        int ravenBonesCount          //Кости ворона
//        int dumplingsCount           //Пельмени(а почему, собственно нет? xD )
// ДЛЯ НАЧАЛА ИСПОЛЬЗУЕМ СКАНЕР ДЛЯ ПОЛУЧЕНИЯ ИНФО ОТ ПОЛЬЗОВАТЕЛЯ И ЗАПИСЫВАЕМ ИХ В НАШИ ПЕРЕМЕННЫЕ
        System.out.println("Введите кол-во Жабьих глаз: ");
        int toadEyesCount = new Scanner(System.in).nextInt();

        System.out.println("Введите кол-во Слез вурдалака: ");
        int ghoulTearsCount = new Scanner(System.in).nextInt();

        System.out.println("Введите кол-во Костей ворона: ");
        int ravenBonesCount = new Scanner(System.in).nextInt();

        System.out.println("Введите кол-во пельменей: ");
        int dumplingsCount = new Scanner(System.in).nextInt();



        //Рецепты Эликсиров:
        // 1. 3 Жабьих глаза + 1 кость ворона - Эликсир зоркости
        // 2. 2 кости ворона + 4 пельменя - Эликсир стойкости
        // 3. 7 слез вурдалака + 1 пельмень + 2 жабьих глаза - Эликсир скрытности
        // 4. 5 слез вурдалака + 10 пельменей + 4 жабьих глаза + 3 кости ворона - Запретный эликсир

        if (toadEyesCount >= 3 && ravenBonesCount >= 1) {
            System.out.println("Вы можете изготовить \"Элексир зоркости\", используя: 3 Жабьих глаза + 1 кость ворона");
        }
        else if (ravenBonesCount >= 2 && dumplingsCount >= 4) {
            System.out.println("Вы можете изготовить \"Элексир стойкости\", используя: 2 кости ворона + 4 пельменя");
        }
        else if (ghoulTearsCount >= 7 && dumplingsCount >= 1 && toadEyesCount >= 2) {
            System.out.println("Вы можете изготовить \"Элексир скрытности\", используя: 7 слез вурдалака + 1 пельмень + 2 жабьих глаза");
        }
        else if (ghoulTearsCount >= 5 && dumplingsCount >= 10 && toadEyesCount >= 3 && ravenBonesCount >= 3) {
            System.out.println("Вы можете изготовить \"Запретный элексир\", используя: 5 слез вурдалака + 10 пельменей + 4 жабьих глаза + 3 кости ворона");
        } else {
            System.out.println("Ваших ингредиентов недостаточно!");
        }
    }
}
