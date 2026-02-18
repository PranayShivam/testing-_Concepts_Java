package com.edu.BasicToAdvJavaQuestions;

public class LeapYearCheck {

    static boolean isLeapYear(long year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}
