package lt.sdaacademy.control_flow.switch_case;

import java.util.Scanner;

public class Excercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite dienos raide");

        String diena = scanner.nextLine();

        switch (diena) {
            case "Pr":
                System.out.println("Pirmadienis");
                break;
            case "A":
                System.out.println("Antradienis");
                break;
            case "T":
                System.out.println("Treciadienis");
                break;
            case "K":
                System.out.println("Ketvirtadienis");
                break;
            case "P":
                System.out.println("Penktadienis");
                break;
            case "S":
                System.out.println("Sestadienis");
                break;
            case "Se":
                System.out.println("Sekmadienis");
                break;
            default:
                System.out.println("Nera tokios dienos");
        }
    }
}
