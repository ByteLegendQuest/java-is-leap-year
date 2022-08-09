package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(isLeapYear(1999));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2004));
    }

    /**
     * `isLeapYear(int year)` returns if the given year is a leap year.
     *
     * <p>A year is a leap year if: If the year can be divided by 400, it is a leap year. If the
     * year can be divided by 100 and is not also divisible by 400, it is not a leap year. If the
     * year can be divided by 4 and is not also divisible by 100, it is a leap year.
     *
     * <p>If `year` is a leap year, return `true`; otherwise, return `false`.
     *
     * <p>For example, 1999 is not a leap year; 2000 is a leap year; 1900 is not a leap year.
     *
     * <p>**Note: `if`/`else` are not allowed; only logical operators are allowed.**
     */
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0 )|| (( year % 4 == 0 )&&(year % 100 != 0)) ? true : false;
    }
}
