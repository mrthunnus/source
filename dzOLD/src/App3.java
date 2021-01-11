package app;

import java.util.Scanner;

public class App3 {

    public static void main(String[] args) {
        System.out.println("Vvedi chislo: ");
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        if (b > 0){
            b++;
        }
        System.out.println(b);
    }
}