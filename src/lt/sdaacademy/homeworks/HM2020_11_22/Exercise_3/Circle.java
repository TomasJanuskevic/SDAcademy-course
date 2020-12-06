package lt.sdaacademy.homeworks.HM2020_11_22.Exercise_3;

public class Circle {
    private double radius;
    private String color;

    Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double calculateLength (){
        return 2 * Math.PI * this.radius;
    }
    public double  calculateArea(){
        return Math.PI * this.radius * this.radius;
    }
}
