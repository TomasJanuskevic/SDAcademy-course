package lt.sdaacademy.homeworks.HM2020_12_05.Exercise_2;

public class FibonaciNumber {
    public static void main(String[] args) {
        System.out.println(fibonaciNumber(9));
    }

    public static int fibonaciNumber(int num) {
        if (num <= 1) {
            return num;
        }
        return fibonaciNumber(num - 1) + fibonaciNumber(num - 2);
    }
}
