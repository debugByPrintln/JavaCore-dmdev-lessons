package lessons.lesson24_3;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;

public class MainRunner {
    public static void main(String[] args) {



          //1 task
//        LocalDateTime time = LocalDateTime.of(2020, 6, 25, 19, 47);
//        LocalDateTime plus = time.plus(3L, ChronoUnit.MONTHS);
//
//        System.out.println(plus.toLocalDate());
//        System.out.println(plus.toLocalTime());


          //2 task
//        LocalDate now = LocalDate.now();
//        String s = now.toString();
//        System.out.println(s);


          //3 task
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy'T'HH:mm");
//        String s = "26-03-1968T09:24";
//        LocalDateTime time = LocalDateTime.parse(s, dateTimeFormatter);
//        System.out.println(time);
//
//
//        //4 task
//        Instant instant = time.toInstant(ZoneId.of("America/Chicago").getRules().getOffset(time));
//        System.out.println(instant);


          //5 task
//        LocalDate now = LocalDate.now();
//        LocalDate other = LocalDate.of(2018, 7, 7);
//
//        long between = ChronoUnit.DAYS.between(other, now);
//        System.out.println(between);


          //6 task
//        LocalDateTime nowTime = now.atStartOfDay();
//        LocalDateTime otherTime = other.atStartOfDay();
//
//        long between = ChronoUnit.SECONDS.between(otherTime, nowTime);
//        System.out.println(between);


          //7 task
//        Instant instant = Instant.now();
//        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of("Africa/Cairo"));
//        System.out.println(instant);
//        System.out.println(zonedDateTime);
//        System.out.println(zonedDateTime.getOffset());

          //8 task
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime time = now.with(value -> value.plus(42L, ChronoUnit.DAYS));
        System.out.println(time);


    }
}
