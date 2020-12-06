package lt.sdaacademy.homeworks.HM2020_11_22.Exercise_2;

public class Dog {
    private String name;
    private int age;
    private String color;

    Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }
}
