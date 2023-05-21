package com.company;

public class arrays {
    //collection of data types
    public static void main(String[] args) {
        // syntax
        // datatype[] variable_name = new datatype[size];
        // store 5 roll numbers:
        int[] rnos = new int[5];
        // or directly
        int[] rnos2 = {23, 12, 45, 32, 15};

        int[] ros; // declaration of array. ros is getting defined in the stack
        ros = new int[5]; // initialisation: actually here object is being created in the heap memory

        String[] arr = new String[4];
        System.out.println(arr[0]);

        //default value of a reference variable is null
        //null is a literal
        //primitives are stored in the stack memory [int, char, boolean]
        //all the objects classes are stored in the heap memory [complex data types] i.e non primitives
    }
}
