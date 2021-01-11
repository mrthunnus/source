package app;
public class Cat extends Animal {
    private int tail;
    public Cat(String a, String b, int c) {
        super(a, b);
        tail = c;
    }

    public void makeNoise()
    {
        System.out.println("Я шуршу по углам");
    }
    public void eat()
    {
        System.out.println("Я ем"+food);
    }
    public void sleep()
    {
        System.out.println("Я сплю по 12 часов в день");
    }

}
