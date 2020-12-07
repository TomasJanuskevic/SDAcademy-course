package lt.sdaacademy.homeworks.HM2020_12_05.Exercise_4;

public class WorkersMain {
    public static void main(String[] args) {
        Worker[] workers = buildWorkers();
        printName(workers);
        printAverageAgeAndSalary(workers);
        printBigestSalaryWorker(workers);
        printYoungestWorker(workers);
        printMWorker(workers);
    }

    public static Worker[] buildWorkers() {
        return new Worker[]{
                new Worker("John", 1300, 30, 'V'),
                new Worker("Ieva", 900, 26, 'M'),
                new Worker("Bob", 2000, 35, 'V'),
                new Worker("Kate", 1100, 28, 'M'),
                new Worker("John", 1800, 32, 'V')
        };
    }

    public static void printName(Worker[] workers) {
        for (Worker worker : workers) {
            System.out.println(worker.getName().toUpperCase());
        }
    }

    public static void printAverageAgeAndSalary(Worker[] workers) {
        int sumAge = 0;
        double sumSalary = 0;
        for (Worker worker : workers) {
            sumAge += worker.getAge();
            sumSalary += worker.getSalary();
        }
        System.out.println("Average age: " + (double) sumAge / workers.length + "\n" +
                "Average salary: " + sumSalary / workers.length);
    }

    public static void printBigestSalaryWorker(Worker[] workers) {
        Worker bigestSalaryWorker = workers[0];
        for (Worker worker : workers) {
            if (bigestSalaryWorker.getSalary() < worker.getSalary()) {
                bigestSalaryWorker = worker;
            }
        }
        System.out.println("Bigest salary have worker: " + bigestSalaryWorker);
    }

    public static void printYoungestWorker(Worker[] workers) {
        Worker youngestWorker = workers[0];
        for (Worker worker : workers) {
            if (youngestWorker.getAge() > worker.getAge()) {
                youngestWorker = worker;
            }
        }
        System.out.println("Youngest worker: " + youngestWorker);
    }

    public static void printMWorker(Worker[] workers) {
        for (Worker worker : workers) {
            if (worker.getGender() == 'M') {
                System.out.println(worker);
            }
        }
    }
}
