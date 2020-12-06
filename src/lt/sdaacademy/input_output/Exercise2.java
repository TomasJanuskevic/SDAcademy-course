package lt.sdaacademy.input_output;

public class Exercise2 {
    public static void main(String[] args) {
        System.out.println("Hello world");

        System.out.println("println atspausdina pranešimą ir žymeklį nukelią i sekancią eilutę");
        System.out.print("print atspausdina pranešimą ir žymeklį palieka toje pačioje eilutėje \n");

        System.out.printf("printf atspausdina %s pranešimą su formatu \n", "mano");

        int decimalValue = 10;
        System.out.printf("...arba skaičių: %d \n", decimalValue);

        double floatingPointValue = 15.2266;
        System.out.printf("...arba apvalinti reiksmes: %.1f \n", floatingPointValue);

        String text = "dinamiškai";
        System.out.printf("...arba viską kartu: %f %s %d \n", floatingPointValue, text, decimalValue);
    }
}
