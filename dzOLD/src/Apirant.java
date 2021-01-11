package app;

public class Apirant extends Student {
    public String Diplom;

    //Конструктор с Наследованием
    public Apirant(String FirstName, String SecondName, String Group, double avarageMark, String Diplom) {
        super(FirstName, SecondName, Group, avarageMark);
        this.Diplom =  Diplom;
    }

    //Предопределение
    public int getScholarship(double avarageMark)
    {
        if (avarageMark==5) return 200;
        else return 100;
    }
}
