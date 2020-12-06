package lt.sdaacademy.control_flow.if_else;

public class Example3 {
    public static void main(String[] args) {
        int age = 35;

        if (age < 18) {
            System.out.println("Tu esi paauglys");
        } else if (age > 100) {
            System.out.println("Tu esi senas");
        } else {
            System.out.println("Tu esi suaugęs");
        }
    }
}

