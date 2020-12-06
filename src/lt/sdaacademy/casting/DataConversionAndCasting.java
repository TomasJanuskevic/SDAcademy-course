package lt.sdaacademy.casting;

public class DataConversionAndCasting {
    public static void main(String[] args) {
        //byte 8 bit
        //short 16 bit
        //int 4 bytes
        //long 8 bytes

        byte byteNum;
        short shortNum = 12;
        int intNum;
        long longNum = 1234658L;

        //intNum = longNum;
        intNum = shortNum;

        int intNum1 = 1110;
        short shortNum1;
        shortNum = (byte) intNum1; //duomenu tipo casting, galimas praradimas
        System.out.println(shortNum);

        //float 4 bytes
        float floatNum  = 15.78f;
        //double 8 bytes
        double doubleNum = 50;

        System.out.println(doubleNum);
        doubleNum = floatNum;
        System.out.println(doubleNum);

        floatNum = (float)doubleNum;
        System.out.println(floatNum);


    }
}
