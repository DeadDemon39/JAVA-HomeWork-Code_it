public class Main {
    public static void main(String[] args) {

        Phone phone1 = new Phone("89814523162","nokia",0.130);
        phone1.receiveCall("Denis");

        Phone phone2 = new Phone("1122334455", "motorolla", 0.700);
        phone2.receiveCall("Anton", "223311");

        Phone.madeIn = "china";

        System.out.println(phone1.modelPhone + "\n" + phone1.numberPhone + "\n" + phone1.weightPhone + "\n" + Phone.madeIn);
    }
}
