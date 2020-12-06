package lt.sdaacademy.sandbox;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
int[] array = {1,2,3};
        System.out.println(Arrays.toString(test1(array)));
    }

    public static int[] test1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 1;
        }
        return arr;
    }
}

