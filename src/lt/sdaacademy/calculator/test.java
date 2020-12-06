package lt.sdaacademy.calculator;

import java.util.Scanner;

public class test {

    public static double numScanner() {
        Scanner scannerDouble = new Scanner(System.in);
        double num;
        while (true) {
            try {
                System.out.println("Iveskite skaiciu");
                num = scannerDouble.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("Blogai ivedete, veskite is naujo");
                scannerDouble.next();
            }
        }
        return num;
    }


    public static void main(String[] args) {


        String testi = "TAIP";

        while (testi.equals("TAIP")) {
            Scanner scannerString = new Scanner(System.in);
            String action;

            double result;

            result = numScanner();


            while (true) {
                System.out.println("Iveskite +, -, *, / arba =");
                while (true) {
                    action = scannerString.nextLine();
                    if (action.equals("+") || action.equals("-") || action.equals("/") || action.equals("*") || action.equals("=")) {
                        break;
                    }
                    System.out.println("Blogai ivedete, veskite is naujo +, -, * arba /");
                }

                if (action.equals("=")) {
                    System.out.println(result);
                    break;
                }

                double num2 = numScanner();

                switch (action) {
                    case "+":
                        result += num2;
                        System.out.println(result);
                        break;
                    case "-":
                        result -= num2;
                        System.out.println(result);
                        break;
                    case "*":
                        result *= num2;
                        System.out.println(result);
                        break;
                    case "/":
                        result /= num2;
                        System.out.println(result);
                        break;
                }
            }

            System.out.println("Ar norite testi?\nIveskite TAIP arba NE");
            testi = scannerString.nextLine();

            switch (testi) {
                case "TAIP":
                    testi = "TAIP";
                    break;
                case "NE":
                    testi = "NE";
                    break;
                default:
                    System.out.println("Blogai ivedete, programa issijungia");
            }
        }
    }
}


