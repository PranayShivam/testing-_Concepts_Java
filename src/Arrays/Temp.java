package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {

  /*      Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] arr = new int[5];
        arr[0] = 1;
        for (int i = 0; i < arr.length; i++) {
            int a = i;
            arr[i] = a++;
        }

        int a = 10; // primitive data type   --...> Stack Memory
        String s1 = "hello";
        System.out.println(s1 + 'c');// Non Primitive Data Type
        System.out.println(s1);

        System.out.println(Arrays.toString(arr)); */

        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(4);
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i = 0; i < n; i++) {
//            arrayList.add(i);
//        }
//        System.out.println(arrayList);
//        System.out.println(arrayList.size());

        int[][] arr = new int[3][4];

        System.out.println(arr.length);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                arr[i][j] = 10;
            }
        }
    }
}
