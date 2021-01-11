package app;

public interface Shape {

    //Интерфейс
    public double square();

    public static void main(String[] args) {
        Shape[] SpisokFigur = new Shape[3];
        SpisokFigur[0] =  new Triangle(5,5,5);
        SpisokFigur[1] =  new Circle(5);
        SpisokFigur[2] =  new Rectangle(5, 5);

        for (Shape sh: SpisokFigur){
            System.out.println("Площадь фигуры: "+sh.square());
        }
    }

}
