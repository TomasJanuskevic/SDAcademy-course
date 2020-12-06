package lt.sdaacademy.loop.while_loop;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite bet ka");
        String answer = scanner.nextLine();

        while (answer.equals("NE")) {
            System.out.println("Jai ivesite bet ka apart 'NE', prograna baigs darba");
            answer = scanner.nextLine();
        }
    }
}
