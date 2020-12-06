package lt.sdaacademy.homeworks.HM2020_12_05.Exercise_1;

public class Exercise_1 {
    public static void main(String[] args) {
        System.out.println(factorial(6));
    }
    public static int factorial (int number){
        int factorial = 1;
        for(int i = 0; i<number; i++){
            factorial*=i+1;
        }
        return factorial;
    }
}
