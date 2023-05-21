package com.company;

import java.util.Arrays;

public class searchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56}, // to search 34 = row:2, col:2
                {18, 12}
        };

        int target = 34;
        int[] ans = search(arr,target); // format of return value {row, col}
        System.out.println(Arrays.toString(ans)); //(search in the(array, for target element)
        System.out.println(max(arr,target));
        System.out.println(Integer.MIN_VALUE);


    }

    static int[] search(int[][] arr, int target){ // return integer
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col}; //new int because not initialised above

                }

            }

        }
        return new int[] {-1,-1};

    }

    static int max(int[][] arr, int target) { // return integer
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }


            }

        }
        return max;
    }
}
