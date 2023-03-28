package Animals;

public class Bird extends Animal {
    String call;
    public Bird(String call)
    {
        super();
        this.call =  call;
    }

    public static void fly() {
        System.out.println("Bird is flying");
    }

}
