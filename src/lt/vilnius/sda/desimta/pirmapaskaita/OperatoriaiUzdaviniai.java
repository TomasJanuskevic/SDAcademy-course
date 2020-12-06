package lt.vilnius.sda.desimta.pirmapaskaita;

import static java.lang.Math.PI;

public class OperatoriaiUzdaviniai {
    public static double average(double... a) {
        double sum = 0;
        for (double b : a) {
            sum += b;
        }
        return Math.round((sum / a.length) * 100.0) / 100.0;
    }

    public static void main(String[] args) {
        int result;
        double result2;
        // 1 uzduotis
        int x = 74;
        int y = 36;
        result = x + y;

        System.out.println(result);

        // 2 uzduotis
        x = 50;
        y = 3;
        result = x % y;
        System.out.println("50/3=16 reminder " + result);

        // 3 uzduotis
        result = -5 + 8 * 6;
        System.out.println(result);
        result = (55 + 9) % 9;
        System.out.println(result);
        result = 20 + -3 * 5 / 8;
        System.out.println(result);
        result = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println(result);

        // 4 uzduotis

        result2 = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        System.out.println("((25.5*3.5-3.5*3.5)/(40.5-4.5)) = " + result2);

        // 5 uzduotis

        Circle cir = new Circle(3);
        cir.infoCircle();

        // 6 uzduotis

        System.out.println(average(2, 4, 4, 56, 8, 45, 102));

    }
}

class Circle {
    double radius;
    double perimeter;
    double area;

    Circle(double radius) {
        if (radius > 0) {
            this.radius = radius;
            this.perimeter = Math.round((2 * PI * radius) * 100.0) / 100.0;
            this.area = Math.round((PI * radius * radius) * 100.0) / 100.0;
        } else {
            System.out.println("Radius cant be negative");
        }
    }

    public void infoCircle() {
        System.out.println("Area = " + area + ", Perimeter = " + perimeter);
    }
}






