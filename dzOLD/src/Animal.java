package app;
public class Animal {
    public String food;
    public String location;
    public void makeNoise()
    {
      System.out.println("Я издаю такой-то шум");
    }
    public void eat()
    {
        System.out.println("Я ем"+food);
    }
    public void sleep()
    {
        System.out.println("Я сплю");
    }
    public Animal(String a, String b)
    {
        food = a;
        location = b;
    }
}
