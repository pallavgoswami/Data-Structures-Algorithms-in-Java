package com.company;

import java.util.Arrays;

public class swappingValues {
    public static void main(String[] args) {
        int[] arr = {23, 44, 55, 66, 77,};
        swap(arr, 0, 4);

        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
