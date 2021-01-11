package app;
public class Dog extends Animal {
    private String Poroda;
    public Dog(String a, String b, String c) {
        super(a, b);
        Poroda = c;
    }

    public void makeNoise()
    {
        System.out.println("Я лаю на улицу");
    }
    public void eat()
    {
        System.out.println("Я ем"+food);
    }
    public void sleep()
    {
        System.out.println("Я сплю по 10 часов в день");
    }

}
