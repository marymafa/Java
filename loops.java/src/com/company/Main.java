package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] cars = {"BWM","Ford","Volvo"};
        cars[0] = "Opel";

        for (String i :cars){
            System.out.println(i);
        }

//        System.out.println(cars[0]);
    }
}
