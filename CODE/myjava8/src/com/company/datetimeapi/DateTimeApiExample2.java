package com.company.datetimeapi;

import java.time.LocalDateTime;

public class DateTimeApiExample2 {
    public static void main(String[] args) {

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current date time: " + dateTime);

        // This can also be done with LocalDate
        System.out.println("Date after 20 days: " + dateTime.plusDays(20));
        System.out.println("Date after 2 months: " + dateTime.plusMonths(2));
        System.out.println("Date after 3 years: " + dateTime.plusYears(3));

        System.out.println("Date before 20 days: " + dateTime.minusDays(20));
        System.out.println("Date before 2 months: " + dateTime.minusMonths(2));
        System.out.println("Date before 3 years: " + dateTime.minusYears(3));

        System.out.println("Date before 3 hours: " + dateTime.minusHours(3));
        System.out.println("Date before 3 minutes: " + dateTime.minusMinutes(3));
        System.out.println("Date before 3 seconds: " + dateTime.minusSeconds(3));


    }
}
