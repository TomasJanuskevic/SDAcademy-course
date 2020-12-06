package lt.sdaacademy.homeworks.HM2020_11_22.Exercise_5;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Car[] car = new Car[3];
        Scanner scannerString = new Scanner(System.in);
        Scanner scannerDouble = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Iveskite automobilio modeli: ");
            String model = scannerString.nextLine();
            System.out.println("Iveskite automobilio varikli: ");
            double engine = scannerDouble.nextDouble();
            System.out.println("Iveskite automobilio metus: ");
            int year = scannerInt.nextInt();
            System.out.println("Iveskite automobilio kaina: ");
            int price = scannerInt.nextInt();
            System.out.println("Iveskite automobilio tipa: ");
            String type = scannerString.nextLine();
            car[i] = new Car(model, engine, year, price, type);
        }
        newestCar(car);
        System.out.println("Vidutine automobiliu kaina: " + averagePrice(car));
        modelOfCarSedan(car);
        mostExpensiveCar(car);
    }

    public static void newestCar(Car[] car) {
        int indexOfNewestCar = 0;
        for (int i = 0; i < car.length - 1; i++) {
            if (car[i].getYear() < car[i + 1].getYear()) {
                indexOfNewestCar = i + 1;
            }
        }
        System.out.println("Naujausio automobilio metai: " + car[indexOfNewestCar].getYear());
    }

    public static double averagePrice(Car[] car) {
        int sumPrice = 0;
        for (Car cars : car) {
            sumPrice += cars.getPrice();
        }
        return (double) sumPrice / car.length;
    }

    public static void modelOfCarSedan(Car[] car) {
        for (Car cars : car) {
            if (cars.getType().equals("sedan")) {
                System.out.println("Automobolio modelis sedan tipo: " + cars.getModel());
            }
        }
    }
    public static void mostExpensiveCar(Car[] car) {
        int indexOfMostExpensiveCar = 0;
        for (int i = 0; i < car.length - 1; i++) {
            if (car[i].getPrice() < car[i + 1].getPrice()) {
                indexOfMostExpensiveCar = i + 1;
            }
        }
        System.out.println("Brangiausio automobilio kaina: " + car[indexOfMostExpensiveCar].getPrice());
    }
}
