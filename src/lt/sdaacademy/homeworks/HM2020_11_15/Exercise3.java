package lt.sdaacademy.homeworks.HM2020_11_15;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite skaiciu");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("Jusu skaicius lyginis");
        } else {
            System.out.println("Jusu skaicius nelyginis");
        }
    }
}
