package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class arraysInput {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // array of primitives
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 55;
        arr[2] = 36;
        arr[3] = 66;
        arr[4] = 33;
        System.out.println(arr[3]);

        //input using for loop
        for (int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
            System.out.println(arr[i]);
        }

        //input using for each loop
        for (int num: arr){ // for every element in the array, print the element
            System.out.println(num + " "); // here num represents element of the array
        }

        //printing the array by converting it to a string
        System.out.println(Arrays.toString(arr));

        //array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        //modify
        str[1] = "Pallav";
        System.out.println(Arrays.toString(str));
    }
}
