package com.ankit;

public class ReverseNum {
    public static void main(String[] args) {
        int n = 12345;
        int revnum=0;

        while (n>0){
          int  rem = n%10;
          n/=10;
          revnum = revnum*10+rem;
        }
        System.out.println(revnum);
    }
}
