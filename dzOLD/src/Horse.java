package app;
public class Horse extends Animal {
    private double strenght;
    public Horse(String a, String b, double c) {
        super(a, b);
        strenght = c;
    }

    public void makeNoise()
    {
        System.out.println("Я стучу копытом");
    }
    public void eat()
    {
        System.out.println("Я ем"+food);
    }
    public void sleep()
    {
        System.out.println("Я сплю по 8 часов в день");
    }

}
