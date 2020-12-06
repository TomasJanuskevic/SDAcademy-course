package lt.sdaacademy.loop.while_loop;

import java.util.Random;

public class Example2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int number = 0;

        while (number < 90) {
            number = rnd.nextInt(100); //maksimalus random skaicius - 100
            System.out.println(number);
            if (number > 80) {
                break;
            }
        }
    }
}
