package lt.sdaacademy.calculator;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        boolean arTesti = false;
        do {
            Scanner scannerInt = new Scanner(System.in);
            Scanner scannerString = new Scanner(System.in);
            System.out.println("Iveskite pirma skaiciu");
            int num1 = scannerInt.nextInt();
            System.out.println("Iveskite antra skaiciu");
            int num2 = scannerInt.nextInt();
            System.out.println("Iveskite +, -, * arba /");
            String action = scannerString.nextLine();

            switch (action) {
                case "+":
                    System.out.println(num1 + num2);
                    break;
                case "-":
                    System.out.println(num1 - num2);
                    break;
                case "*":
                    System.out.println(num1 * num2);
                    break;
                case "/":
                    System.out.println(num1 / num2);
                    break;
                default:
                    System.out.println("Nera tokio veiksmo");
            }
            System.out.println("Ar norite testi? Taip ar Ne?");
            String arTesti1 = scannerString.nextLine();

            switch (arTesti1) {
                case "Taip":
                    arTesti = true;
                    break;
                case "Ne":
                    arTesti = false;
                    break;
            }
        } while (arTesti);
    }
}
