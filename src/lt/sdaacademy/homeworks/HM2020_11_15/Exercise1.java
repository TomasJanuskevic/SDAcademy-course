package lt.sdaacademy.homeworks.HM2020_11_15;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);
        System.out.println("Iveskite pirma skaiciu");
        int num1 = scannerInt.nextInt();
        System.out.println("Iveskite antra skaiciu");
        int num2 = scannerInt.nextInt();
        System.out.println("Iveskite +, -, * arba /");
        String action = scannerString.nextLine();

        if (action.equals("+")) {
            System.out.println(num1 + num2);
        } else if (action.equals("-")) {
            System.out.println(num1 - num2);
        } else if (action.equals("/")) {
            System.out.println(num1 / num2);
        } else if (action.equals("*")) {
            System.out.println(num1 * num2);
        }
    }
}
