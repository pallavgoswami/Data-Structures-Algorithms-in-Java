package com.company;

public class linearSearch {
    public static void main(String[] args) {
        int[] nums = {23, 45, 56, 67, 33, 67, 22, -11, -2};
        int target = 22;
        int ans = linearSearch(nums, target); // passing nums and target
        System.out.println(ans);

    }

    // search the target and return true or false
    static boolean linearSearch3(int[] arr, int target){ //passing arr and target
        if ( arr.length == 0){
            return false;
        }
        //for each loop
        for (int element : arr ){
            if (element == target){
                return true;

            }
        }
        return false;
    }

    // search the target and return the element
    static int linearSearch2(int[] arr, int target){
        if ( arr.length == 0){
            return -1;
        }
        //for each loop
        for (int element : arr ){
            if (element == target){
                return Integer.MAX_VALUE;

            }
        }
        return -1;
    }

    // search in the array return index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        // run a for loop
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index if it is = target
            int element = arr[index];
            if (element == target){
                return index; // this will be returned to the function call above
            }
        }

        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }


}
