package lt.sdaacademy.sandbox;

public class Arrays {
    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 10, 9};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("vidurkis = " + (double) sum / arr.length);

        int[] arr2 = {1, 7, 3, 10, 9};
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}

