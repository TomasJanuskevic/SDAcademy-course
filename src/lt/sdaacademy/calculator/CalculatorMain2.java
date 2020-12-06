package lt.sdaacademy.calculator;

import java.util.Scanner;

public class CalculatorMain2 {

    public static void main(String[] args) {
        mainCalulator();
    }

    private static double getUserNumber() {
        Scanner scannerDouble = new Scanner(System.in);
        double userNumber;
        while (true) {
            try {
                System.out.println("Iveskite skaiciu");
                userNumber = scannerDouble.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("Blogai ivedete, veskite is naujo");
                scannerDouble.next();
            }
        }
        return userNumber;
    }

    private static String getUserAction() {
        Scanner scannerString = new Scanner(System.in);
        String userAction;
        System.out.println("Iveskite +, -, *, / arba =");
        while (true) {
            userAction = scannerString.nextLine();
            if (userAction.equals("+") || userAction.equals("-") || userAction.equals("/") || userAction.equals("*") || userAction.equals("=")) {
                break;
            }
            System.out.println("Blogai ivedete, veskite is naujo +, -, * arba /");
        }
        return userAction;
    }

    private static boolean getUserAnswer() {
        Scanner scannerString = new Scanner(System.in);
        System.out.println("Ar norite testi?\nIveskite TAIP arba NE");
        String userAnswer = scannerString.nextLine();
        switch (userAnswer) {
            case "TAIP":
                return true;
            case "NE":
                return false;
            default:
                System.out.println("Blogai ivedete, programa issijungia");
                return false;
        }
    }

    private static double getUserResult(String action, double intermediateResult, double userNumber) {
        double userResult = 0;
        switch (action) {
            case "+":
                userResult = intermediateResult + userNumber;
                System.out.printf("%.2f\n", userResult);
                break;
            case "-":
                userResult = intermediateResult - userNumber;
                System.out.printf("%.2f\n", userResult);
                break;
            case "*":
                userResult = intermediateResult * userNumber;
                System.out.printf("%.2f\n", userResult);
                break;
            case "/":
                userResult = intermediateResult / userNumber;
                System.out.printf("%.2f\n", userResult);
                break;
        }
        return userResult;
    }

    public static void mainCalulator() {
        boolean answer = true;
        while (answer) {
            double intermediateResult = getUserNumber();
            while (true) {
                String action = getUserAction();
                if (action.equals("=")) {
                    System.out.printf("Rezultatas: %.2f\n", intermediateResult);
                    break;
                }
                double userNumber = getUserNumber();
                intermediateResult = getUserResult(action, intermediateResult, userNumber);
            }
            answer = getUserAnswer();
        }
    }
}





