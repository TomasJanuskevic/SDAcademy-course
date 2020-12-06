package lt.sdaacademy.arrays.one_dimensional;

public class Example2 {
    public static void main(String[] args) {
        int[] arraysOfInts = {10, 15, 20, 555, 987, 548};
        System.out.println(arraysOfInts[4]);
        System.out.println(arraysOfInts[2]);
        System.out.println(arraysOfInts[0]);

        System.out.println("Array size: " + arraysOfInts.length);
        for (int i = 0; i < arraysOfInts.length; i++) {
            System.out.print(arraysOfInts[i] + " ");
        }
    }
}
