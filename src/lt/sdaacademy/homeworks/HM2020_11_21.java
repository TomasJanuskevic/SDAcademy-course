package lt.sdaacademy.homeworks;

import java.util.Arrays;

public class HM2020_11_21 {
    public static void main(String[] args) {
        uzduotis_1();
        uzduotis_2();
        uzduotis_3();
        uzduotis_4();
        uzduotis_5();
        uzduotis_6();
    }

    private static void uzduotis_1() {
        int[] arr = {1, 7, 3, 10, 9};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Vidurkis = " + (double) sum / arr.length);
    }

    private static void uzduotis_2() {
        int[] arr = {1, 7, 3, 10, 9};
        System.out.print("Nelyginiai skaiciai: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    private static void uzduotis_3() {
        int[] arr = {1, 7, 3, 10, 9};
        int[] arrReverse = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrReverse[i] = arr[arr.length - 1 - i];
        }
        System.out.println(Arrays.toString(arrReverse));
    }

    private static void uzduotis_4() {
        int[] arr = {1, 7, 3, 10, 9};
        int lyginiuSk = 0;
        int nelyginiaiSk = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                lyginiuSk++;
            } else {
                nelyginiaiSk++;
            }
        }
        System.out.printf("Lyginiu skaiciu yra: %d\nNelyginiu skaiciu yra: %d\n", lyginiuSk, nelyginiaiSk);
    }

    private static void uzduotis_5() {
        int arr[] = {1, 7, 3, 7, 10, 1, 9};

        int n = 1;
        System.out.print("Pasikartojantys skaiciai: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - n; j++) {
                if (arr[i] == arr[i + j]) {
                    System.out.print(arr[i] + " ");
                }
            }
            n++;
        }
        System.out.println();
    }

    private static void uzduotis_6() {
        int arr[] = {1, 2, 7, 3, 10, 2, 9};

        int n = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - n; j++) {
                if (arr[i] + arr[i + j] == 4) {
                    System.out.println(arr[i] + "+" + arr[i + j] + "=4");
                }
            }
            n++;
        }
    }
}




