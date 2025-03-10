package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ProgramsForArrays {
    public static void main(String[] args) {
        int [] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 7;
        arr[3] = 4;
        arr[4] = 5;
//        System.out.println(Arrays.toString(arr));
//        swap(arr, 1, 3);
//        System.out.println(Arrays.toString(arr));

//        int maxVal = max(arr);
//        System.out.println(maxVal);
//        int maxValInRange = maxInRange(arr, 3, 4);
//        System.out.println(maxValInRange);

        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int firstIndex, int lastIndex){
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[lastIndex];
        arr[lastIndex] = temp;
    }

    static int max(int [] arr){
        int maxVal = Integer.MIN_VALUE;
        System.out.println(maxVal);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
    static int maxInRange(int [] arr, int startIndex, int endIndex){

        // Edge Cases
        if (startIndex > endIndex){
            System.out.println("End Index cannot be greater than Start Index");
        }
        int maxVal = Integer.MIN_VALUE;
        System.out.println(maxVal);
        for (int i = startIndex; i <= endIndex; i++) {
            if (arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    static void reverseArray(int [] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start< end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
