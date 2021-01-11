package app;

import java.util.Scanner;

public class App1 {

    public static void main(String[] args) {
        System.out.println("Chislo vvedi:");
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        int a1 = b%10;
        int a2 = (b%100)/10;
        int a3 = b/100;
        System.out.println(a1+a2+a3);
    }
}