package com.week2;

/**
 *
 */

public class Overloading {
    public static void main(String[] args) {

    }

//    int add(int x, int y) {
//        return x + y;
//    }

 //     int add(int a, int b) {
 //         return a + b;
 //   }

    long add(int a, long b) {
        return a + b;
    }

    long add(long a, int b) {
        return a + b;
    }
    /////////////이런게 오버로딩이다......
}
