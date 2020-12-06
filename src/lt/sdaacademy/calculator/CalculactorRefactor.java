package lt.sdaacademy.calculator;

import java.util.Scanner;

public class CalculactorRefactor {
    public static void main(String[] args) {
        calculate();
    }

    public static int getUserEnteredNumber(String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(text);
        return scanner.nextInt();
    }

    public static String getUserEnteredAction(String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(text);
        return scanner.nextLine();
    }

    public static double getResult(String action, int num1, int num2) {
        switch (action) {
            case ("+"): {
                return num1 + num2;
            }
            case ("-"): {
                return num1 - num2;
            }
            case ("*"): {
                return num1 * num2;
            }
            case ("/"): {
                return (double) num1 / num2;
            }
            default: {
                System.out.println("Veiksmas nebuvo rastas");
                return 0;
            }
        }
    }

    public static void calculate() {
        int num1 = getUserEnteredNumber("Įveskite pirmą skaičių");
        int num2 = getUserEnteredNumber("Įveskite antrą skaičių");
        String action = getUserEnteredAction("Įveskite veiksmą");

        System.out.println(getResult(action, num1, num2));
    }
}
