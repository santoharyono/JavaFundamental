package com.javafundamental.datetime;

import java.time.*;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjusters;
import java.util.*;

public class DateTimeExample {

    public static void main(String[] args) {
//        Instant instantToday = Instant.now();
//        LocalDate localToday = LocalDate.of(2018, Month.APRIL, 11);
//        LocalDateTime localDateTimeToday = LocalDateTime.now();
//        ZonedDateTime zonedDateTime = ZonedDateTime.now();
//
//        System.out.println(instantToday);
//        System.out.println(localToday);
//        System.out.println(localDateTimeToday);
//        System.out.println(zonedDateTime);

//        DayOfWeek and Month
//        DayOfWeek dow = DayOfWeek.THURSDAY;
//        Locale locale = Locale.getDefault();
//        System.out.println(dow.getDisplayName(TextStyle.FULL, locale));
//        System.out.println(dow.getDisplayName(TextStyle.NARROW, locale));
//        System.out.println(dow.getDisplayName(TextStyle.SHORT, locale));
//
//        MonthDay date = MonthDay.of(Month.FEBRUARY, 29);
//        boolean validLeapYear = date.isValidYear(2016);
//        System.out.println(date);
//        System.out.println(validLeapYear);
//
        Set<String> allZones = ZoneId.getAvailableZoneIds();
        LocalDateTime dt = LocalDateTime.now();

// Create a List using the set of zones and sort it.
        List<String> zoneList = new ArrayList<String>(allZones);
        Collections.sort(zoneList);

        for (String s : zoneList) {
            ZoneId zone = ZoneId.of(s);
            ZonedDateTime zdt = dt.atZone(zone);
            ZoneOffset offset = zdt.getOffset();
            int secondsOfHour = offset.getTotalSeconds() % (60 * 60);
            String out = String.format("%35s %10s%n", zone, offset);

            // Write only time zones that do not have a whole hour offset
            // to standard out.
            if (secondsOfHour != 0) {
                System.out.printf(out);
            }
        }
        LocalDate myDate = LocalDate.now();
        System.out.printf("The previous thursday is : %s%n", myDate.with(TemporalAdjusters.previous(DayOfWeek.THURSDAY)));

        ZonedDateTime zdt = ZonedDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
        System.out.println(zdt);
    }
}
