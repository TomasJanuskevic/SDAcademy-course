package lt.sdaacademy.homeworks.HM2020_11_15;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite pirma skaiciu");
        int num1 = scanner.nextInt();
        System.out.println("Iveskite antra skaiciu");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("Pirmas skaicius didesnis");
        } else if (num1 < num2) {
            System.out.println("Antras skaicius didesnis");
        } else {
            System.out.println("Skaiciai yra lygus");
        }
    }
}
