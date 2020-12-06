package lt.sdaacademy.homeworks;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;


public class HM2020_11_14 {
    public static void main(String[] args) {
        // 1 uzduotis

        String text = "Ad Astra Per Aspera";
        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());
        System.out.println(text.replace("A", "X"));
        System.out.println(text.startsWith("Ad"));

        System.out.println(); // 2 uzduotis

        String dataTime = "2020-07-09T11:11:11";
        LocalDateTime localDateTime = LocalDateTime.parse(dataTime);
        System.out.println(localDateTime);

        System.out.println(); // 3 uzduotis
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime1 = LocalDateTime.now();
        System.out.println(localDate.plusYears(5).plusMonths(2).plusDays(1));
        System.out.println(localDateTime1.plusYears(5).plusMonths(2).plusDays(1));

        System.out.println(); // 4 uzduotis


        System.out.println(Duration.between(LocalDateTime.of(2020, 1, 5, 0, 0, 0),
                LocalDateTime.of(2020, 5, 1, 0, 0, 0)).toMinutes());

        System.out.println(); // 5 uzduotis
        double a = 9.5;
        int b = 7;

        int c = (int)a;
        double d = b;
        System.out.println(c);
        System.out.println(d);


    }


}
