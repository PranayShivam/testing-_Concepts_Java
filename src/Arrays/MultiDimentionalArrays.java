package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimentionalArrays {
    public static void main(String[] args)	{
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
		/*
		1 2 3
		4 5 6
		7 8 9
		*/

// Can be treated as an Array of Arrays
        int [][] arrDemo = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int [][] arr2d = new int[3][3];  // Adding the rows are mandatory  int [rows] [coloums]

        int [][] arr = {
                {1, 3, 5},	//0th index
                {2, 4},	//1st Index
                {6, 8, 9, 10}	// 2nd Index
        };

        // Accepting inputs from user
        //> .Length return the value of row
//        for (int i = 0; i<arr2d.length ;i++ )	{
//            for (int j = 0; j < arr2d[i].length; j++) {
//                arr2d[i][j]= sc.nextInt();
//            }
//        }
//        Normal for Loop
        for (int i = 0; i < arr2d.length; i++) {
            // for each column in every row
            for (int j = 0; j < arr2d[i].length; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
//        Enhanced For loop
//        for (int[] n : arr2d){
//            System.out.println(Arrays.toString(n));
//        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

//        Using enhanced for Loop for arr
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
