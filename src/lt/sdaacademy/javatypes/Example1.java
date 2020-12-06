package lt.sdaacademy.javatypes;

public class Example1 {
    public static void main(String[] args) {
        //char data type
        char character = 'r';
        char newLine = '\n';
        char tab = '\t';

        System.out.println(character + "\n" + character);

        //bool data type
        // TODO learn String data type
        boolean boolTrue = true;
        boolean boolFalse = false;
        System.out.println(boolFalse + " " + boolTrue);

        //String data type
        String text = "Labas rytas";
        String text2 = "Labas rytas";

        String text3 = new String("Labas rytas");
        String text4 = new String("Labas rytas");
        System.out.println(text == text3);
        System.out.println(text.equals(text3));

        System.out.println("\n" + text.equals(text2));
        System.out.println(text == text2);

        System.out.println("\n" + text3.equals(text4));
        System.out.println(text3 == text4);

        System.out.println(text.toUpperCase());
        System.out.println("TEKSTAS YRA TRUMPAS".toLowerCase());
        System.out.println("TEKSTAS YRA TRUMPAS".indexOf("YRA"));
        System.out.println("2020-11-14".replaceAll("-", "."));
        System.out.println("VIenas".length());

        String joke = "Hahahah! Funny joke!";
        System.out.println(joke.replaceAll("a", "o"));


    }
}
