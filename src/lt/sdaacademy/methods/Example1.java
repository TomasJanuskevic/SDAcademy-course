package lt.sdaacademy.methods;

public class Example1 {
    public static void main(String[] args) {
        methodPrintsText();
        methodDoesLogic();
        methodDoesLogic();
        methodReturnsIntegerNumber();
        int number = methodReturnsIntegerNumber();
        System.out.println(number);

        double sumOfNubers = methodAcceptsValuesDoesLogicAndReturns(3, 5.5,
                "Metodas priima argumentus, atlieka logika ir grazina rezultata");
        System.out.println(sumOfNubers);

        double doubleNum = methodAcceptsValuesDoesLogicAndReturns(8,50,"Tekstas");
        System.out.println(doubleNum);
    }

    public static void methodPrintsText() {
        System.out.println("Method prints text");

    }

    public static void methodDoesLogic() {
        for (int i = 0; i < 3; i++) {
            System.out.println("FOr loop in method");
        }
    }

    public static int methodReturnsIntegerNumber() {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        return sum;
    }

    public static double methodAcceptsValuesDoesLogicAndReturns(int intNum, double doubleNum, String text) {
        System.out.println(text);
        double sumOfNumbers = intNum + doubleNum;
        return sumOfNumbers;
    }
}
