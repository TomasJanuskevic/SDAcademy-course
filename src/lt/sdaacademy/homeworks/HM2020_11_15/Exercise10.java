package lt.sdaacademy.homeworks.HM2020_11_15;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite vejo greiti, km/h");
        int vejoGreitis = scanner.nextInt();
        double buefortoSkale = Math.pow(vejoGreitis / 3.01, 2.0 / 3.0);

        if (buefortoSkale > 12) {
            System.out.println("Beuforto skale: 12");
        } else {
            System.out.printf("Beuforto skale: %.0f \n", buefortoSkale);
        }
        if(vejoGreitis>20){
            System.out.println("Vejo greitis stiprus");
        } else {
            System.out.println("Vejo greitis silpnas");
        }
    }

}
