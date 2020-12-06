package lt.sdaacademy.homeworks.HM2020_11_15;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        double num3 = (double) num1 / num2;

        System.out.printf("Rezultatas %.2f", num3);
    }
}
