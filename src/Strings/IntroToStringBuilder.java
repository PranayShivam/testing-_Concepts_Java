package Strings;

import java.util.Arrays;

public class IntroToStringBuilder {
    public static void main(String[] args) {

        // Example 1
//        printSeriesWithoutOptimization();
        /**
         * in the above Operation we are printing a to z
         * this causes high memory wastage
         * Time Complexity would be On^2
         * Because here every alphabet when added to string series creates a new object
         *  a, ab, abc, abcd,........., abcd...xyz
         *  this causes high memory wastage
         */
        printSeriesWithOptimization();
        /**
         * String Builder allows us to modify the values
         * SO, a , ab, abc ...  there will be no new objects
         * It will keep adding new object to the existing String
         * Only one object is made and the modifications are done to it
         */
    }

    public static void printSeriesWithoutOptimization(){
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series = series+ch;
        }
        System.out.println(series);
    }

    public static void printSeriesWithOptimization(){
        StringBuilder series = new StringBuilder();
//        StringBuilder series1 = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series.append(ch);
//            series1.append(i);
        }
        System.out.println(series);
//        System.out.println(series1);
    }
}
