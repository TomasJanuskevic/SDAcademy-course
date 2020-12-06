package lt.sdaacademy.homeworks.HM2020_11_15;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite skaiciu");
        int num = scanner.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("fizzBuzz");
        } else if (num % 5 == 0) {
            System.out.println("buzz");
        } else if (num % 3 == 0) {
            System.out.println("fizz");
        } else {
            System.out.println("Skaitmuo nesidalina is 3 ir is 5");
        }
    }
}

