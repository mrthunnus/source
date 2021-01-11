package app;

public class Phone {

    public double weight;
    public int number;
    public String model;
    public String name;

    //Возвращение информации о том, кто звонит
    public void receiveCall(){
        System.out.println("Звонит "+name);
    }

    //Получить номер
    public int getNumber()
    {
        return number;
    }

    //Нормальный конструктор белого человека
    public Phone(String name, double weight, String model, int number){
        this.name=name;
        this.weight=weight;
        this.model=model;
        this.number=number;
    }

    //Конструктор с двумя
    public Phone(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    //Пустой конструктор
    public Phone(){
    }

    //В конструктор из трех добавляем два
    public Phone(String name, double weight, String model)
    {
        this(name, weight);
        this.model=model;

    }
    //Номер и Имя
    public void receiveCall2()
    {
        System.out.println("Звонит "+name+". Его номер: "+number);
    }
    //Несколько вариантов
    public void SendMessage(int ... n)
    {
        for (int i : n) {
            System.out.println("Номер "+i);
        }
    }



    public static void main(String[] args){
        //Создание экземпляров
        Phone Korg= new Phone("Korg", 199.2, "Ruhlid", 55496);
        System.out.println("Владелец: " + Korg.name + ". Его телефон  - " + Korg.model + ". Его номер: " + Korg.number + ", а его телефон весит:" + Korg.weight);
        Phone Oleg= new Phone("Oleg", 199.8, "Note8Pro", 53543);
        System.out.println("Владелец: " + Oleg.name + ". Его телефон  - " + Oleg.model + ". Его номер: " + Oleg.number + ", а его телефон весит:" + Oleg.weight);
        Phone Sokrat= new Phone("Sokrat", 198, "Reno2", 55354);
        System.out.println("Владелец: " + Sokrat.name + ". Его телефон  - " + Sokrat.model + ". Его номер: " + Sokrat.number + ", а его телефон весит:" + Sokrat.weight);
        Phone Koma= new Phone("Koma", 220, "Kitaec", 55456);
        System.out.println("Владелец: " + Koma.name + ". Его телефон  - " + Koma.model + ". Его номер: " + Koma.number + ", а его телефон весит:" + Koma.weight);
        //Проверка I
        Koma.receiveCall();
        Sokrat.receiveCall();
        Oleg.receiveCall();
        //Проверка II
        System.out.println(Koma.getNumber());
        System.out.println(Oleg.getNumber());
        System.out.println(Sokrat.getNumber());
        //Проверка III
        Koma.receiveCall2();
        //Проверка IV
        System.out.println("Первое задание с 2 номерами");
        Koma.SendMessage(Koma.getNumber(),Oleg.getNumber());
        System.out.println("Первое задание с 1 номерамом");
        Koma.SendMessage(Sokrat.getNumber());


}
}
