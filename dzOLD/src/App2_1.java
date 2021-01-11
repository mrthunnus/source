package app;

public class App2_1 {
    public static void main(String[] args) {
        Phone p1 = new Phone(8901,"m1",8.2);
        Phone p2 = new Phone(8902,"m2",7.6);
        Phone p3 = new Phone(8903,"m3",6.8);
        System.out.println("Первый телефон:");
        System.out.println("number="+p1.getNumber() + ",model=" + p1.getModel()+",weight="+p1.getWeight());
        System.out.println("Второй телефон:");
        System.out.println("number="+p2.getNumber() + ",model=" + p2.getModel()+",weight="+p2.getWeight());
        System.out.println("Третий телефон:");
        System.out.println("number="+p3.getNumber() + ",model=" + p3.getModel()+",weight="+p3.getWeight());
        p1.receiveCall("Koma");
        p2.receiveCall("Socrat");
        p3.receiveCall("Korg");
        p1.receiveCall("Koma",8904);
        p1.SendMessag(8904,8905);
        p2.SendMessag(8904,8906,8907);
        p3.SendMessag(8907);
    }
}
