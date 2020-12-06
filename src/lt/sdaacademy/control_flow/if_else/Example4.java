package lt.sdaacademy.control_flow.if_else;

public class Example4 {
    public static void main(String[] args) {
        int points = 13;

        if(points>100){
            System.out.println("Laimėjai");
        } else if (points == 30 || points ==50){
            System.out.println("Taškai sudegė :/");
        } else if (points < 15 && points > 12){
            System.out.println("Turi mažai taškų");
        } else {
            System.out.println("Tęskite toliau");
        }
    }
}
