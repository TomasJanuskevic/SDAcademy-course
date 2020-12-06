package lt.sdaacademy.object_oriented.car;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Iveskite automobilio modeli");
        String model = scanner.nextLine();

        System.out.println("Iveskite automobilio turi");
        double engine = scanner.nextDouble();

        System.out.println("Iveskite duru kieki");
        int doors = scanner.nextInt();

        System.out.println("Ar automobilis vaziuoja?");
        boolean isRunAndDrive = scanner.nextBoolean();
        Car carObject = new Car(model, engine, doors, isRunAndDrive);
        Car carObject1 = new Car(model, doors);
        System.out.println(carObject.getEngine());


    }
}
