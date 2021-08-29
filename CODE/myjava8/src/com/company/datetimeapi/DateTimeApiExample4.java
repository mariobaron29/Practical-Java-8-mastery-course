package com.company.datetimeapi;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeApiExample4 {
    public static void main(String[] args) {

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("My zone: " +zoneId);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Local date time: " + dateTime);

        ZoneId zoneIdLA = ZoneId.of("America/Los_Angeles");

        System.out.println("Los Angeles' time zone: "  + zoneIdLA + ", time: " + LocalDateTime.now(zoneIdLA));
        System.out.println("Los Angeles' date time: "  + ZonedDateTime.now(zoneIdLA));

        ZoneId zoneIdGMT = ZoneId.of("GMT+05:30");

        System.out.println("GMT time zone: " + zoneIdGMT);
        System.out.println("Date time at LA: " + ZonedDateTime.now(zoneIdGMT));
    }
}
