package app;

public class Rectangle implements Shape{
    double dlina,shirnia;

    //Конструктор
    public Rectangle(double dlina,double shirnia)
    {
        this.dlina=dlina;
        this.shirnia=shirnia;

    }

    //Площадь
    public double square(){
        return dlina*shirnia;
    }
}
