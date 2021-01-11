package app;

public class Triangle implements Shape {
    double Dno,StoronaSleva,StoronaSprava;

    //Конструктор
    public Triangle(double Dno,double StoronaSleva,double StoronaSprava)
    {
        this.Dno=Dno;
        this.StoronaSleva=StoronaSleva;
        this.StoronaSprava=StoronaSprava;
    }

    //Площадь
    public double square(){
        double p =(Dno+StoronaSleva+StoronaSprava)/2;
        return Math.sqrt(p*(p-Dno)*(p-StoronaSleva)*(p-StoronaSprava));
    }
}
