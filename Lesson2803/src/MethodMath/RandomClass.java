package MethodMath;

public class RandomClass {
    public static void main(String[] args) {
        System.out.println(Math.random());
        System.out.println(randomInt(15, 22));
        System.out.println(Math.sqrt(8));
        System.out.println(randomDouble(15.01,22.33));
        System.out.println(randomShort(8,111));



    }
    public static int randomInt(int min, int max) {
        return (int) (Math.random() * ((max - min) + 1) + min);
    }
    public static double randomDouble (double min, double max) {
        return (double) (Math.random() * ((max - min) + 0.1) + min);
    }
    public static short randomShort(int min, int max) {
        return (short) (Math.random() * ((max - min) + 1) + min);
    }

}
