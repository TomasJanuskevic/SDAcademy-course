package lt.sdaacademy.homeworks.HM2020_12_05.Exercise_5;

public class Computer {
    private String computerMaker;
    private double price;
    private String color;
    private int madeIn;

    public Computer(String computerMaker, double price, String color, int madeIn) {
        this.computerMaker = computerMaker;
        this.price = price;
        this.color = color;
        this.madeIn = madeIn;
    }

    public String getComputerMaker() {
        return computerMaker;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public int getMadeIn() {
        return madeIn;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "computerMaker='" + computerMaker + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", madeIn='" + madeIn + '\'' +
                '}';
    }
}
