package app;

import java.util.Scanner;

public class App5 {

    public static void main(String[] args) {
        System.out.println("Vvedi chislo: ");
        Scanner a = new Scanner(System.in);
        int a1 = a.nextInt();
        int a2 = a.nextInt();
        int a3 = a.nextInt();
        int c = a1;
        if (a1 > a2){
            c = a2;
        }
        if (a2 > a3) {
            c = a3;
        }
        System.out.println(c);
    }
}