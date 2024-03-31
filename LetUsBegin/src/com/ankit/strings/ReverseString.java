package com.ankit.strings;

public class ReverseString {

    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(reverseStringWithSB(str));
        //System.out.println(reverseStringWithoutSB(str));
}

static String reverseStringWithSB(String str) {
 return new StringBuilder(str)
         .reverse()
         .toString();
}
}