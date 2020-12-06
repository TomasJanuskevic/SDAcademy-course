package lt.sdaacademy.loop.for_loop;

public class Example3 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            if (i == 1) {
                continue;
            }
            System.out.println("Continue example: " + i);
        }
        for (int i = 0; i < 4; i++) {
            if (i == 1) {
                break;
            }
            System.out.println("Break example: " + i);
        }

        // continue - persoka per viena iteracija
        // break - nutraukia cikla

        for (int i = 0; i < 10; i++) {
            if (i == 2 || i == 5) {
                continue;
            }
            System.out.println("Continue example: " + i);
        }
    }

}
