package app;

public class Student {
    public String FirstName;
    public String SecondName;
    public String Group;
    public double avarageMark;

    //Конструктор
    public Student(String FirstName, String SecondName, String Group, double avarageMark){
        this.FirstName=FirstName;
        this.SecondName=SecondName;
        this.Group=Group;
        this.avarageMark=avarageMark;
    }

    //Оценк Стипендии
    public int getScholarship(double avarageMark){

        if (avarageMark==5) return 100;
        else return 80;
    }

    public static void main(String[] args) {
        //Массив студентов и Аспирантов
        Student[] MTUCI= new Student[4];
        MTUCI[0]= new Student("Alexander","Korjov","БУТ1701",3);
        MTUCI[1]= new Student("Olejka","Rizhov","БУТ1701",4.8);
        MTUCI[2]= new Apirant("Alexander","Dubleschikov","БУТ1701",4.4,"Диллема заключенного");
        MTUCI[3]= new Apirant("Komerbak","Lukmanov","БУТ1701",4.6,"Определение наличия меланом");

        for (int i = 0;i<MTUCI.length;i++)
        {
            System.out.println(MTUCI[i].getScholarship(MTUCI[i].avarageMark));
        }
    }

}
