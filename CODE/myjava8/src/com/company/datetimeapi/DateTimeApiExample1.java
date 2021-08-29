package com.company.datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeApiExample1 {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println("Today's date: " + date);

        LocalTime time = LocalTime.now();
        System.out.println("current time: " + time);

        // get Day, mont, year
        System.out.println("Day: " + date.getDayOfMonth());
        System.out.println("Month: " + date.getMonthValue());
        System.out.println("Year: " + date.getYear());

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current date time: " + dateTime);

        // Get hour, minute, second
        System.out.println("Hour: " + time.getHour());
        System.out.println("Minute: " + time.getMinute());
        System.out.println("Second: " + time.getSecond());
        System.out.println("Nano second: " + time.getNano());

        LocalDateTime futureDateTime = LocalDateTime.of(2021, 9, 21,20,9,30);
        System.out.println("Future date time: " + futureDateTime);
    }
}
