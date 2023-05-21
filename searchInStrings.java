package com.company;

import java.util.Arrays;

public class searchInStrings {
    public static void main(String[] args) {
        String name = "Pallav";
        char target = 'a';
//        System.out.println(search(name, target));

        System.out.println(Arrays.toString(name.toCharArray()));

    }

    static boolean search2(String str, char target){ // passing str and target
        if(str.length() == 0){ //it is a function therefore no brackets
            return false;
        }

        for(char ch : str.toCharArray()) { //str converted to char array
            if (ch == target) {
                return true;
            }
        }
        return false;

    }


    static boolean search(String str, char target){ // passing str and target
        if(str.length() == 0){ //it is a function therefore no brackets
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {//character at index
                return true;
            }

        }
        return false;

    }
}
