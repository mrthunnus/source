package app;

import java.util.Scanner;

public class App6 {
    public static void main(String[] args) {
        System.out.println("Vvedi chislo: ");
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();

        if ((b < 0) && (b%2 == 0)){
            System.out.println("Otric chetn");
        }
        if ((b < 0) && (b%2 != 0)){
            System.out.println("Otric nechent");
        }
        if ((b > 0) && (b%2 == 0)){
            System.out.println("Pol cethn");
        }
        if ((b > 0) && (b%2 != 0)){
            System.out.println("Pol nechent");
        }
        if (b ==0){
            System.out.println("Zero");
        }
    }
}