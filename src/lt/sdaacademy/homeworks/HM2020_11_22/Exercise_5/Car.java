package lt.sdaacademy.homeworks.HM2020_11_22.Exercise_5;

public class Car {
    private String model;
    private double engine;
    private int year;
    private int price;
    private String type;

    public Car(String model, double engine, int year, int price, String type) {
        this.model = model;
        this.engine = engine;
        this.year = year;
        this.price = price;
        if (type.equals("sedan")||type.equals("suv")||type.equals("touring")){
            this.type = type;
        }

    }

    public String getModel() {
        return model;
    }

    public double getEngine() {
        return engine;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }
}
