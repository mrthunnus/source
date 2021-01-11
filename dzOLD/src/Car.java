package app;

public abstract class Car {
    public String marka,clas;
    public double weight;
    public Engine motor;
    abstract void start();
    abstract void stop();
    public void turnRight(){
        System.out.println("Поворот направо");
    }
    public void turnLeft(){
        System.out.println("Поворот налево");
    }
    abstract void printinfo();
}

