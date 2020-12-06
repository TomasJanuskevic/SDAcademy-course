package lt.sdaacademy.homeworks.HM2020_11_22.Exercise_3;

public class CircleMain {
    public static void main(String[] args) {
        Circle circle = new Circle(3, "red");
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculateLength());
        System.out.println(circle.getColor());
    }
}
