package lt.sdaacademy.homeworks.HM2020_11_15;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite skaiciu nuo 0 iki 9");
        int num = scanner.nextInt();
        switch (num) {
            case 0:
                System.out.println("Nulis");
                break;
            case 1:
                System.out.println("Vienas");
                break;
            case 2:
                System.out.println("Du");
                break;
            case 3:
                System.out.println("Trys");
                break;
            case 4:
                System.out.println("Keturi");
                break;
            case 5:
                System.out.println("Penki");
                break;
            case 6:
                System.out.println("Sesi");
                break;
            case 7:
                System.out.println("Septyni");
                break;
            case 8:
                System.out.println("Astuoni");
                break;
            case 9:
                System.out.println("Devyni");
                break;
            default:
                System.out.println("Neteisingas skaicius");

        }

    }
}
