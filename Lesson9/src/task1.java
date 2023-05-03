import java.util.Scanner;

public class task1 {
    static String booksInfo = "";


    public static void main(String[] args) {
        while (true) {
            String name = inputBookName();
            int pageCount = inputPageCount();
            double bookPrice = bookPrice();
            addBook(name);
            addBook(name, pageCount, bookPrice);
            //todo использовать новый метод тут
            printInfo();
        }
    }

    public static String inputBookName() {
        System.out.println("Введите название книги:");
        return new Scanner(System.in).nextLine();
    }

    public static int inputPageCount() {
        System.out.println("Введите кол-во страниц:");
        return new Scanner(System.in).nextInt();
    }
    public static double bookPrice() {
        System.out.println("Введите цену книги: ");
        return new Scanner(System.in).nextDouble();
    }

    public static void addBook(String bookName) {
        addBook(bookName, 0, 0);
    }

    public static void addBook(String bookName, int pageCount, double bookPrice) {
        booksInfo = booksInfo + bookName + " - " + (pageCount > 0 ? pageCount : "N/A") + " стр. - " + "Цена книги = " + (bookPrice > 0 ? bookPrice + "рублей" : "Не установленно\n");
    }

    public static void printInfo() {
        System.out.println(booksInfo);
    }


}