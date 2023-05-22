public class Person {
    private String name; // ИМЯ
    private String post; // ДОЛЖНОСТЬ
    private String placeOfWork; // МЕСТО РАБОТЫ
    private int age; // ВОЗРАСТ
    private double salary; // ЗАРПЛАТА

    public Person(String name, String post, String placeOfWork, int age, double salary) {
        this.name = name;
        this.post = post;
        this.placeOfWork = placeOfWork;
        this.age = age;
        this.salary = salary;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getPlaceOfWork() {
        return placeOfWork;
    }

    public void setPlaceOfWork(String placeOfWork) {
        this.placeOfWork = placeOfWork;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
