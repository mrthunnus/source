package app;
import java.util.Scanner;
public class App2 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int val1 = value % 10;
        int val2 = (value % 100) / 10;
        value = value / 100;
        System.out.println(val1 + val2 + value);
    }
}