package lt.sdaacademy.homeworks.HM2020_11_15;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int metai = scanner.nextInt();
        if (metai % 4 == 0 && metai % 100 != 0 || metai % 400 == 0) {
            System.out.println("metai yra keliamieji");
        } else {
            System.out.println("Metai nera keliamieji");
        }
    }
}
