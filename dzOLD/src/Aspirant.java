package app;

public class Aspirant extends Student {
    public String temaNauRab;
    public Aspirant(String firstName, String lastName, String group, double averageMark,String temaNauRab) {
        super(firstName, lastName, group, averageMark);
       this.temaNauRab =  temaNauRab;
    }
    public int getScholarship(double a)
    {
        if (a==5) return 200;
        else return 100;
    }
}
