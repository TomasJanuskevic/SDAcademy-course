package lt.sdaacademy.date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Example1 {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        System.out.println(localTime.plusHours(7));
        System.out.println(localTime.withMinute(59));
        System.out.println(localTime.withHour(23).withMinute(23).withSecond(23));

        System.out.println(localTime.getHour());

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.getYear());
        System.out.println(localDate.plusYears(5));
        System.out.println(localDate.minusMonths(5));

        String date = "2000-01-01";
        localDate = LocalDate.parse(date);
        System.out.println(localDate);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.withMonth(5));
        System.out.println(localDateTime.minusYears(2));
    }
}
