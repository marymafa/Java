package com.company;
//
//Write a function
//
//        TripleDouble(long num1, long num2)
//
//        which takes numbers num1 and num2 and returns 1 if there is a straight triple of a number at any place in num1 and also a straight double of the same number in num2.
//
//        If this isn't the case, return 0
//        Examples
//
//        TripleDouble(451999277, 41177722899) == 1 // num1 has straight triple 999s and
//        // num2 has straight double 99s
//
//        TripleDouble(1222345, 12345) == 0 // num1 has straight triple 2s but num2 has only a single 2
//
//        TripleDouble(12345, 12345) == 0
//
//        TripleDouble(666789, 12345667) == 1

public class Main {

    public static void main(String[] args) {
	// write your code here
        kata1 test = new kata1();
        System.out.println(test.TripleDouble(451999277L, 41177722899L));
        System.out.println(test.TripleDouble(1222345L, 12345L));

    }
}