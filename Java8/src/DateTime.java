import java.time.*;

public class DateTime {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        LocalDate d1 = LocalDate.of(2002,8,30);
        System.out.println(d);
        System.out.println(d1);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        LocalTime t = LocalTime.now();
        System.out.println(t);

        for(String s : ZoneId.getAvailableZoneIds()){
            ZonedDateTime z = ZonedDateTime.now(ZoneId.of(s));
            System.out.println(z);
        }





    }
}
