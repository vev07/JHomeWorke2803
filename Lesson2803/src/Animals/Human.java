package Animals;

public class Human extends Animal{
    String country;
    int age;

    public Human(String country, int age) {
        super();
        this.country = country;
        this.age = age;
    }

    public void create() {
        System.out.println("Human is thinking");
    }
}
