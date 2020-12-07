package lt.sdaacademy.homeworks.HM2020_12_05.Exercise_4;

public class Worker {
    private String name;
    private double salary;
    private int age;
    private char gender;

    public Worker(String name, double salary, int age, char gender) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
