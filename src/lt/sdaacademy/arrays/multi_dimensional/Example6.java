package lt.sdaacademy.arrays.multi_dimensional;

public class Example6 {
    public static void main(String[] args) {
        char[][] tableOfChars = new char[2][2];

        tableOfChars[0] =new char[] {'a', 'b'};
        tableOfChars[1] =new char[] {'c', 'd'};

        for (int n = 0; n < tableOfChars.length; n++) {
            for (int m = 0; m < tableOfChars[n].length; m++) {
                System.out.print(tableOfChars[n][m] + " ");
            }
            System.out.println();
        }

    }
}
