package lt.sdaacademy.input_output;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Įveskite pirmą skaicių");
        double firstNum = scanner.nextDouble();
        System.out.println("Įveskite antrą skaicių");
        double secondNum = scanner.nextDouble();

        double result = firstNum * secondNum;
        System.out.println("Rezultatas: " + result);
    }

}
