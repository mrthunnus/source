package app;

public class SportCar extends Car {
    double maxSpeed;
    void start() {
        System.out.println("Грузовик поехал");
    }
    void stop() {
        System.out.println("Грузовик остановился");
    }
    void printinfo() {
        System.out.println("Марка машины: " + marka + "\n клсасс машины: " + clas + "\n вес машины: " + weight + "\n максимальная скорость: " + maxSpeed + "\n мощность мотора: " + motor.might + "\n Производитель мотора: " + motor.maker);
    }
}
