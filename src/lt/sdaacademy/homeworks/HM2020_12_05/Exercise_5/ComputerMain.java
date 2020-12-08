package lt.sdaacademy.homeworks.HM2020_12_05.Exercise_5;

public class ComputerMain {
    public static void main(String[] args) {
        Computer[] computers = buildComputer();
        printCheapestComputer(computers);
        printOldestMadeComputer(computers);
        printComputersStartWithA(computers);
        printHowManyIsBlack(computers);

    }

    public static Computer[] buildComputer() {
        return new Computer[]{
                new Computer("ALIEN_WARE", 2000.5, "BLACK", 2016),
                new Computer("ASUS", 1500.0, "YELLOW", 2012),
                new Computer("DELL", 2500.99, "RED", 2019),
                new Computer("ALIEN_WARE", 800.6, "BLACK", 2020),
                new Computer("DELL", 999.99, "RED", 2009)
        };
    }

    public static void printOldestMadeComputer(Computer[] computers) {
        Computer OldestMadeComputer = computers[0];
        for (Computer computer : computers) {
            if (OldestMadeComputer.getMadeIn() > computer.getMadeIn()) {
                OldestMadeComputer = computer;
            }
        }
        System.out.println("Oldest computer: " + OldestMadeComputer);
    }

    public static void printCheapestComputer(Computer[] computers) {
        Computer cheapestComputer = computers[0];
        for (Computer computer : computers) {
            if (cheapestComputer.getPrice() > computer.getPrice()) {
                cheapestComputer = computer;
            }
        }
        System.out.println("Cheapest computer: " + cheapestComputer);
    }

    public static void printComputersStartWithA(Computer[] computers) {
        for (Computer computer : computers) {
            if (computer.getComputerMaker().startsWith("A")) {
                System.out.println(computer);
            }
        }
    }

    public static void printHowManyIsBlack(Computer[] computers) {
        int counter = 0;
        for (Computer computer : computers) {
            if(computer.getColor().equals("BLACK")){
                counter++;
            }
        }
        System.out.println("Black computers: " + counter);
    }
}
