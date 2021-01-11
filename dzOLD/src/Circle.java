package app;

public class Circle implements Shape {
    double radius;

    //Конструктор
    public Circle(double radius)
    {
        this.radius=radius;
    }

    //Площадь
    public double square(){
        return radius*radius*3.14;
    }
}
