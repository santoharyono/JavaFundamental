package com.javafundamental.datetime;

import java.time.*;
import java.time.format.TextStyle;
import java.util.Locale;

public class DateTimeExample {

    public static void main(String[] args) {
        Instant instantToday = Instant.now();
        LocalDate localToday = LocalDate.now();
        LocalDateTime localDateTimeToday = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        System.out.println(instantToday);
        System.out.println(localToday);
        System.out.println(localDateTimeToday);
        System.out.println(zonedDateTime);

//        DayOfWeek and Month
        DayOfWeek dow = DayOfWeek.THURSDAY;
        Locale locale = Locale.getDefault();
        System.out.println(dow.getDisplayName(TextStyle.FULL, locale));
        System.out.println(dow.getDisplayName(TextStyle.NARROW, locale));
        System.out.println(dow.getDisplayName(TextStyle.SHORT, locale));
    }

}
