package com.company;

public class FizzBuzz {
    public static String fizzBuzz(int num) {
        for( int number = 0; number<50; number++ ){
     if (number % 3 == 0) { if (number % 5 == 0) { return "fizzbuzz"; } else { return "fizz"; } } else if (number % 5 == 0) { return "buzz"; } return String.valueOf(number);
    };
    };
};
