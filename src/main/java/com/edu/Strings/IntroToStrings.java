package com.edu.Strings;

public class IntroToStrings {
    public static void main(String[] args) {
        // for example
        int[] arr                           =           {2, 4, 6, 8, 20, 23};
//    ref var -> Stored in stack memory                Object stored in Heap memory

        String str = "Pranay Kr";
//     {datatype} {ref Var} = {Object}  String objects are stored in string pool
        // for Example :- If
        String s1 = "Pranay";
        String s2 = "Pranay";
        // Strings are stored n string Pool ->  String pool is a separate memory structure stored in Heap Memory
        //  Thus both s1  & s2 are pointing to same object in pool, this is to increase Performance
        s1 = "Bose";  // Original Object not changed but a new Object is Created
        /**
         * Though s1 and s2 points to the same object, changing s1 to Bose won't change the value of s2
         * this is because Strings are immutable in java and can't be destroyed, Pranay will still remain in pool once created
         * For security reasons Strings are immutable
         */

    }


}
