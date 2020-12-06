package lt.sdaacademy.input_output;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Koks jūsų vardas");
        String name = scanner.nextLine();
        System.out.println("Sveiki " + name);

        System.out.println("Galiu sudėti 2 int tipo skaičius");
        System.out.println("Įveskite pirmą skaicių");
        int firstNum = scanner.nextInt();
        System.out.println("Įveskite antrą skaicių");
        int secondNum = scanner.nextInt();
        int result = firstNum + secondNum;
        System.out.println("Rezultatas: " + result);
    }
}
