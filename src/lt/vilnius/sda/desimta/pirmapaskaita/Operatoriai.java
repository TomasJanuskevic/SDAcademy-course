package lt.vilnius.sda.desimta.pirmapaskaita;

public class Operatoriai {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int result;

        int suma = x + y;
        System.out.println(suma);
        System.out.println(x + y);

        x = 50;
        x += 50;              //x = x + 50
        System.out.println(x);

        x = 50;
        x += 100;
        x -= 20;
        x /= 2;
        System.out.println(x);

        x = 16;
        y = 7;
        result = x / y;
        System.out.println(result);

        result = x % y;
        System.out.println(result);

        x++;           // x+1
        System.out.println(x);
        x--;           // x-1
        System.out.println(x);

        int amzius1 = 25;
        int amzius2 = 26;
        boolean arGaliuUzeitiIKarusele;
        boolean arVienodasAmzius = amzius1 == amzius2;



        int svoris = 200; //kg
        int ugis = 120;  //cm
        int amzius = 30;

        arGaliuUzeitiIKarusele = svoris<100 && ugis>140 || amzius>=26;
        System.out.println("Ar galiu uzeiti i karusele?");
        System.out.println(arGaliuUzeitiIKarusele);


    }
}
