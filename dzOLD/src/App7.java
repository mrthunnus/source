package app;

import java.util.Scanner;

public class App7 {
    public static void main(String[] args) {
        System.out.println("Gorod?");
        Scanner a = new Scanner(System.in);
        double b = a.nextInt();

        if (b == 905){
            b = 4.15*10;
            System.out.println("Moscow: " + b);
        }
        if (b == 194){
            b = 1.98*10;
            System.out.println("Rostov: " + b);
        }
        if (b == 491){
            b = 2.69*10;
            System.out.println("Krasnodar: " + b);
        }
        if (b == 800){
            b = 5*10;
            System.out.println("Kirov: " + b);
        }
    }
}