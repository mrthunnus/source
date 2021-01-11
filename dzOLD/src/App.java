package app;
        import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("Vvedi chislo: ");
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        System.out.println(b % 10);
    }
}