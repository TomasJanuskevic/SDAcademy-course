package lt.sdaacademy.object_oriented.car;

public class Car {
    private String model;
    private double engine;
    private int numbersOfDoors;
    private boolean isRunAndDrive;

    Car(String m, double e, int n, boolean i) {
        model = m;
        engine = e;
        numbersOfDoors = n;
        isRunAndDrive = i;
    }

    Car(String m, int n) {
        model = m;
        numbersOfDoors = n;
    }

    public String getModel() {
        return model;
    }

    public double getEngine() {
        return engine;
    }

    public int getNumbersOfDoors() {
        return numbersOfDoors;
    }

    public boolean isRunAndDrive() {
        return isRunAndDrive;
    }
}