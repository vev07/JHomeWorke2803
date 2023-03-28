package Animals;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Human man = new Human("UK", 35);
        Bird parrot = new Bird("Kesha");
        animal.eat();
        animal.sleep();
        man.eat();
        man.sleep();
        man.create();
        parrot.eat();
        parrot.fly();


    }
}
