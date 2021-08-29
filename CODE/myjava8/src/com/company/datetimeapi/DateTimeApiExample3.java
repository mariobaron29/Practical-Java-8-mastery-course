package com.company.datetimeapi;

import java.time.LocalDate;
import java.time.Period;

public class DateTimeApiExample3 {
    public static void main(String[] args) {

        // Get the total years of experience an employee
        LocalDate date = LocalDate.now();
        System.out.println("Current date time: " + date);

        LocalDate startDate = LocalDate.of(2012,01,12);
        System.out.println("Current date time: " + date);

        // Years of experience
        Period period = Period.between(startDate, date); // strtDate is inclusive and ate is exclusive by default

        System.out.println("Years of experience: " + period.getYears());
        System.out.printf("Total experience is %d years, %d months and %d days." , period.getYears(), period.getMonths(), period.getDays());

    }
}
