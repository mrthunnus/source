package app;

import java.util.Scanner;

public class App4 {

    public static void main(String[] args) {
        System.out.println("Vvedi chislo: ");
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        if (b > 0){
            b++;
        }
        else if (b < 0){
            b = b -2;
        }
        else {
            b = 10;
        }
        System.out.println(b);
    }
}