package com.javafundamental.datetime;

import java.time.DateTimeException;
import java.time.Month;
import java.time.Year;
import java.time.YearMonth;
import java.util.Date;

public class MonthInYears {
    public static void main(String[] args) {
        int year = 0;

        if (args.length <= 0) {
            System.out.printf("Usage: Months in year <year>%n");
            throw new IllegalArgumentException();
        }

        try {
            year = Integer.parseInt(args[0]);
        } catch (NumberFormatException ex) {
            System.out.printf("%s is not properly formatted number.%n", args[0]);
            throw ex;
        }

        try {
            Year test = Year.of(year);
        } catch (DateTimeException dex) {
            System.out.printf("%d is not valid year.%n", year);
            throw dex;
        }

        System.out.printf("For the year %d:%n", year);
        for (Month month : Month.values()) {
            YearMonth ym = YearMonth.of(year, month);
            System.out.printf("%s : %d days%n", ym.lengthOfMonth());
        }
    }
}
