package lt.sdaacademy.date_time;

import java.time.*;

public class Example2 {
    public static void main(String[] args) {
      Instant instant = Instant.now();
      instant.atZone(ZoneId.of("Europe/Vilnius"));
        System.out.println(instant);

        System.out.println(Period.between(LocalDate.now(), LocalDate.now().plusMonths(2)).getMonths());
        System.out.println(Duration.ofHours(10).toMinutes());
        System.out.println(Duration.between(LocalDateTime.now(), LocalDateTime.now().plusDays(5)).toMinutes());
    }
}
