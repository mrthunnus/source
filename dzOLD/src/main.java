package app;
public class main {
    public static void main(String[] args) {
        Veteran Aibolit = new Veteran();
        Animal[] animals = new Animal[4];
        animals[0] = new Cat("Рыба","Дом",13);
        animals[1] = new Dog("Кость","Конура","Фокстерьер");
        animals[2] = new Horse("Сено","Конюшня",1.1);
        for (int i=0;i<animals.length;i++)
        {
            Aibolit.treatAnimal(animals[i]);
        }
        System.out.println(animals[3].getClass());
    }
    }
