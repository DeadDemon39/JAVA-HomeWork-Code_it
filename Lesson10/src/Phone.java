public class Phone {
    static String madeIn;
    String modelPhone;
    String numberPhone;
    double weightPhone;

    public Phone() {

    }

    public Phone(String modelPhone, String numberPhone, double weightPhone) {
        this.modelPhone = modelPhone;
        this.numberPhone = numberPhone;
        this.weightPhone = weightPhone;
    }

    public void receiveCall(String name) {
        // System.out.println("Звонит абонент по имени " + name);
        receiveCall(name, "");
    }
    public void receiveCall(String name, String callNumber) {
        if (callNumber == "") {
            System.out.println("Звонит абонент по имени " + name);
        } else {
            System.out.println("Звонит абонент по имени " + name + " номер: " + callNumber);
        }
        // System.out.println("Звонит абонент по имени " + name + " " + (callNumber == "" ? "" : "номер: " + callNumber));
    }

}
