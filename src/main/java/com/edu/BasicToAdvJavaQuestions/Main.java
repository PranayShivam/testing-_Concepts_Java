package com.edu.BasicToAdvJavaQuestions;

import static com.edu.BasicToAdvJavaQuestions.LargestOfThreeNumbers.largestOf3Numbers;
import static com.edu.BasicToAdvJavaQuestions.LargetsOfTwoNumbers.largestOfTwoNumbers;
import static com.edu.BasicToAdvJavaQuestions.LeapYearCheck.isLeapYear;
import static com.edu.BasicToAdvJavaQuestions.PositiveNegativeZeroCheck.positiveNegativeZero;
import static com.edu.BasicToAdvJavaQuestions.Swaping.swapWith3rdVariable;
import static com.edu.BasicToAdvJavaQuestions.Swaping.swapWithout3rdVariable;

public non-sealed class Main extends Factorial {
    public static void main(String[] args) {

        System.out.println("largestOfTwoNumbers: " + largestOfTwoNumbers(2, 5));

        System.out.println("largestOf3Numbers:  " + largestOf3Numbers(2, 4,8));

        System.out.println("positiveNegativeZero: " + positiveNegativeZero(-29));

        System.out.println("isLeapYear: " + isLeapYear(2007));


        swapWith3rdVariable(2, 5);
        swapWithout3rdVariable(2, 5);  /// using XOR Operation


    }
}
