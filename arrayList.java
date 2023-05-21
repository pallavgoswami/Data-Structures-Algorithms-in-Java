package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // syntax
        ArrayList<Integer> list = new ArrayList<>(10); //<Integer> -> cannot use primitives, only wrapper classes
                                                                  // new ArrayList<>(CONSTRUCTOR);
//        list.add(23);
//        list.add(344);
//        list.add(44);
//        list.add(34);
//        list.add(864);
//        System.out.println(list);
//        System.out.println(list.contains(34));
//        System.out.println(list.contains(35));
//
//        list.set(0,99);
//        System.out.println(list);
        
        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here
        }
        System.out.println(list);

    }
}
